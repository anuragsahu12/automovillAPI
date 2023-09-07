package automovill_microservices.microservices.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import automovill_microservices.microservices.entities.WarrantyAvailability;
import automovill_microservices.microservices.others.ScopeResponse;
import automovill_microservices.microservices.others.WarrantyAvailabilityDetails;
import automovill_microservices.microservices.repository.VehicleDetailsRepository;
import automovill_microservices.microservices.repository.WarrantyAvailabilityRepository;
import automovill_microservices.microservices.services.WarrantyAvailabilityService;

@Service
public class WarrantyAvailabilityServiceImpl implements WarrantyAvailabilityService {
     @Autowired
    WarrantyAvailabilityRepository warrantyAvailabilityRepository;
    @Autowired
    VehicleDetailsRepository vehicleDetailsRepository;

    @Override
    public List<WarrantyAvailability> getAmcAvailabilityDetails(){
        return warrantyAvailabilityRepository.findAll();
    }

    @Override
    public ScopeResponse getAvailability(String chassis_num, String scope) {
        WarrantyAvailability warranty = warrantyAvailabilityRepository.findByChassisNumAndScopeOfWork(chassis_num, scope).orElse(null);

        if(warranty != null) {
            int total = warranty.getFrequency();
            int consumed = warranty.getConsumed();
            int available = total - consumed;

            return  ScopeResponse.builder()
                            .available(available)
                            .total(total)
                            .build();

        }
        return ScopeResponse.builder()
                    .available(0)
                    .total(0)
                    .build();
    }

    @Override
    public List<WarrantyAvailabilityDetails> getAmcDetailsByChassisNum(String chassisNum) {

        List<WarrantyAvailability> warrantyAvailabilityDetailsList = warrantyAvailabilityRepository.findByChassisNum(chassisNum);

        List<WarrantyAvailabilityDetails> warrantyDetails = new ArrayList<>();

        for(WarrantyAvailability warranty : warrantyAvailabilityDetailsList) {
            WarrantyAvailabilityDetails tempWarranty = WarrantyAvailabilityDetails.builder()
                                                    .scopeOfWork(warranty.getScopeOfWork())
                                                    .details(warranty.getDetails())
                                                    .frequency(warranty.getFrequency())
                                                    .build();
            
            warrantyDetails.add(tempWarranty);
        }
        return warrantyDetails;

    }
}
