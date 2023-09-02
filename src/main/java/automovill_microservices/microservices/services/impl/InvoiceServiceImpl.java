package automovill_microservices.microservices.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.AmcAvailability;
import automovill_microservices.microservices.entities.Invoices;
import automovill_microservices.microservices.entities.Users;
import automovill_microservices.microservices.entities.VehicleDetails;
import automovill_microservices.microservices.others.AmcAvailabilityDetails;
import automovill_microservices.microservices.others.InvoiceDetailsChassis;
import automovill_microservices.microservices.others.InvoiceRequest;
import automovill_microservices.microservices.others.InvoiceResponse;
import automovill_microservices.microservices.repository.AmcAvailabilityRepository;
import automovill_microservices.microservices.repository.InvoiceRepository;
import automovill_microservices.microservices.repository.UserRepository;
import automovill_microservices.microservices.repository.VehicleDetailsRepository;
import automovill_microservices.microservices.services.InvoiceIdGeneratorService;
import automovill_microservices.microservices.services.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;

    @Autowired
    VehicleDetailsRepository vehicleDetailsRepository;

    @Autowired
    AmcAvailabilityRepository amcAvailabilityRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    InvoiceIdGeneratorService invoiceIdGeneratorService;

    @Override
    public List<Invoices> getInvoices() {
        return invoiceRepository.findAll();
    }

    @Override
    public InvoiceResponse createInvoice(InvoiceRequest request) {
        String invoiceID = "";

        String chassisNum = request.getChassis_num();

        // Get vehicle with the chassis number, if present update the values of last_service_km and last_service_date
        VehicleDetails vehicle = vehicleDetailsRepository.findById(request.getChassis_num()).orElse(null);
        if(vehicle != null) {
            // Update km and service date
            vehicle.setLast_service_km(request.getLast_service_km());
            vehicle.setLast_service_date(request.getLast_service_date());
            vehicleDetailsRepository.save(vehicle);

            // Update Scope Values
            for (String scope : request.getAmc_items()) {
                AmcAvailability amc = amcAvailabilityRepository.findByChassisNumAndScopeOfWork(chassisNum, scope).orElse(null);
                    if (amc != null) {
                        int currentConsumed = amc.getConsumed();
                        int frequency = amc.getFrequency();
                        // System.out.println(amc);

                        if(currentConsumed < frequency) {
                            amc.setConsumed(currentConsumed + 1);
                            amcAvailabilityRepository.save(amc);
                        }
                        // System.out.println(amc);
                    }
            }

            // Get user id for the concerned workshop
            Users workshop = userRepository.findByUsername(request.getWorkshop_id()).orElse(null);
            int workshopID = workshop.getId();

            // Generate invoiceID using the workshopID
            invoiceID = invoiceIdGeneratorService.generateInvoiceId(workshopID);
            

            // Create a invoice
            var invoice = Invoices.builder()
                            .bill_number(invoiceID)
                            .chassisNum(request.getChassis_num())
                            .date_of_booking(request.getDate_of_booking())
                            .services(request.getServices())
                            .total_cost(request.getTotal_cost())
                            .workshop_id(request.getWorkshop_id())
                            .build();

            invoiceRepository.save(invoice);
            // System.out.println(invoice);

            return InvoiceResponse.builder()
                .invoice_id(invoiceID)
                .build();
        }
        return null;
        
    }

    @Override
    public List<InvoiceDetailsChassis> getInvoiceDetailsByChassisNum(String chassisNum) {
        List<Invoices> invoicesList = invoiceRepository.findByChassisNum(chassisNum);

        List<InvoiceDetailsChassis> invoices = new ArrayList<>();

        for(Invoices invoice : invoicesList) {
            InvoiceDetailsChassis tempInv = InvoiceDetailsChassis.builder()
                                                    .bill_number(invoice.getBill_number())
                                                    .date_of_booking(invoice.getDate_of_booking())
                                                    .total_cost(invoice.getTotal_cost())
                                                    .services(invoice.getServices())
                                                    .build();
            
            invoices.add(tempInv);
        }
        return invoices;
    }

    

}
