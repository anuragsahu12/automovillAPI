package automovill_microservices.microservices.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.AmcAvailability;
import automovill_microservices.microservices.others.ScopeRequest;
import automovill_microservices.microservices.others.ScopeResponse;
import automovill_microservices.microservices.repository.AmcAvailabilityRepository;
import automovill_microservices.microservices.services.AmcAvailabilityService;

@Service
public class AmcAvailabilityServiceImpl implements AmcAvailabilityService {
    @Autowired
    AmcAvailabilityRepository amcAvailabilityRepository;

    @Override
    public List<AmcAvailability> getAmcAvailabilityDetails(){
        return amcAvailabilityRepository.findAll();
    }

    @Override
    public ScopeResponse getAvailability(ScopeRequest request) {
        AmcAvailability amc = amcAvailabilityRepository.findByChassisNumAndScopeOfWork(request.getChassis_num(), request.getScope()).orElse(null);

        if(amc != null) {
            int total = amc.getFrequency();
            int consumed = amc.getConsumed();
            int available = total - consumed;

            return  ScopeResponse.builder()
                            .available(available)
                            .total(total)
                            .build();

        }
        return null;
    }



    
}
