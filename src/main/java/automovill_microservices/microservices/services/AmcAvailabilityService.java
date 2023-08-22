package automovill_microservices.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.AmcAvailability;

@Service
public interface AmcAvailabilityService {
    public List<AmcAvailability> getAmcAvailabilityDetails();
}
