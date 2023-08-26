package automovill_microservices.microservices.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.Amc;
import automovill_microservices.microservices.entities.BasicDetails;
import automovill_microservices.microservices.entities.VehicleDetails;
import automovill_microservices.microservices.others.AllBasicDetails;
import automovill_microservices.microservices.repository.AmcRepository;
import automovill_microservices.microservices.repository.BasicDetailsRepository;
import automovill_microservices.microservices.repository.VehicleDetailsRepository;
import automovill_microservices.microservices.services.VehicleDetailsService;

@Service
public class VehicleDetailsServiceImpl implements VehicleDetailsService {
    @Autowired
    private VehicleDetailsRepository vehicleDetailsRepository;
    @Autowired
    private BasicDetailsRepository basicDetailsRepository;
    @Autowired
    private AmcRepository amcRepository;

    public List<VehicleDetails> getVehicleDetails() {
        return vehicleDetailsRepository.findAll();
    }

    @Override
    public AllBasicDetails getVehicleDetailsByChassisNum(String chassisNum) {
        Optional<VehicleDetails> optionalVehicle = vehicleDetailsRepository.findById(chassisNum);
        if (optionalVehicle.isPresent()) {

            VehicleDetails vehicle = optionalVehicle.get();
            String basicDetailsId = vehicle.getBasic_details_id();
            Integer amcID = vehicle.getAmc_id();

             Optional<BasicDetails> optionalBasicDetails = basicDetailsRepository.findById(basicDetailsId);
             Optional<Amc> optionalAmcDetails = amcRepository.findById(amcID);

                if (optionalBasicDetails.isPresent()) {
                    BasicDetails basicDetails = optionalBasicDetails.get();
                    Amc amcDetails = optionalAmcDetails.get();
                    AllBasicDetails allBasicDetails = new AllBasicDetails();
                    allBasicDetails.setChassis_num(vehicle.getChassis_num());
                    allBasicDetails.setPhone_num(vehicle.getPhone_num());
                    allBasicDetails.setOwner(vehicle.getOwner());
                    allBasicDetails.setReg_date(vehicle.getReg_date());
                    allBasicDetails.setWarranty_start(vehicle.getWarranty_start());
                    allBasicDetails.setWarranty_end(vehicle.getWarranty_end());
                    allBasicDetails.setAmc_start_date(vehicle.getAmc_start_date());
                    allBasicDetails.setAmc_end_date(vehicle.getAmc_end_date());
                    allBasicDetails.setLast_service_date(vehicle.getLast_service_date());
                    allBasicDetails.setLast_service_km(vehicle.getLast_service_km());
                    allBasicDetails.setBasic_details_id(vehicle.getBasic_details_id());
                    allBasicDetails.setMake(basicDetails.getMake());
                    allBasicDetails.setModel(basicDetails.getModel());
                    allBasicDetails.setFuel_type(basicDetails.getFuel_type());
                    allBasicDetails.setAmc_type(amcDetails.getType());



                    return allBasicDetails;
                }else{
                    return null;
                }

        
        }else{
            return null;
        }   
    }


}



