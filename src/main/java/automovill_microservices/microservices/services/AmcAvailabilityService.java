package automovill_microservices.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.AmcAvailability;
import automovill_microservices.microservices.others.ScopeResponse;

@Service
public interface AmcAvailabilityService {
    public List<AmcAvailability> getAmcAvailabilityDetails();
    public ScopeResponse getAvailability(String chassis_num, String scope);
}
