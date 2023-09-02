package automovill_microservices.microservices.services.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.AmcAvailability;
import automovill_microservices.microservices.others.AmcAvailabilityDetails;
import automovill_microservices.microservices.others.ScopeResponse;
import automovill_microservices.microservices.repository.AmcAvailabilityRepository;
import automovill_microservices.microservices.repository.VehicleDetailsRepository;
import automovill_microservices.microservices.services.AmcAvailabilityService;

@Service
public class AmcAvailabilityServiceImpl implements AmcAvailabilityService {
    @Autowired
    AmcAvailabilityRepository amcAvailabilityRepository;
    @Autowired
    VehicleDetailsRepository vehicleDetailsRepository;

    @Override
    public List<AmcAvailability> getAmcAvailabilityDetails(){
        return amcAvailabilityRepository.findAll();
    }

    @Override
    public ScopeResponse getAvailability(String chassis_num, String scope) {
        AmcAvailability amc = amcAvailabilityRepository.findByChassisNumAndScopeOfWork(chassis_num, scope).orElse(null);

        if(amc != null) {
            int total = amc.getFrequency();
            int consumed = amc.getConsumed();
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
    public List<AmcAvailabilityDetails> getAmcDetailsByChassisNum(String chassisNum) {

        List<AmcAvailability> amcAvailabilityDetailsList = amcAvailabilityRepository.findByChassisNum(chassisNum);

        List<AmcAvailabilityDetails> amcDetails = new ArrayList<>();

        for(AmcAvailability amc : amcAvailabilityDetailsList) {
            AmcAvailabilityDetails tempAmc = AmcAvailabilityDetails.builder()
                                                    .scopeOfWork(amc.getScopeOfWork())
                                                    .details(amc.getDetails())
                                                    .frequency(amc.getFrequency())
                                                    .build();
            
            amcDetails.add(tempAmc);
        }
        return amcDetails;

    }
        
        



    
}
