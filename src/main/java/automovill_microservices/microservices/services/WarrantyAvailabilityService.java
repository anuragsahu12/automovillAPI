package automovill_microservices.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.WarrantyAvailability;
import automovill_microservices.microservices.others.ScopeResponse;
import automovill_microservices.microservices.others.WarrantyAvailabilityDetails;

@Service
public interface WarrantyAvailabilityService {
    public List<WarrantyAvailability> getAmcAvailabilityDetails();
    public ScopeResponse getAvailability(String chassis_num, String scope);
    public List<WarrantyAvailabilityDetails> getAmcDetailsByChassisNum(String chassisNum);
}
