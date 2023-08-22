package automovill_microservices.microservices.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.AmcAvailability;
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
}
