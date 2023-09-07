package automovill_microservices.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.WarrantyAvailability;
import automovill_microservices.microservices.others.WarrantyAvailabilityDetails;
import automovill_microservices.microservices.others.WarrantyScopesResponse;

@Service
public interface WarrantyAvailabilityService {
    public List<WarrantyAvailability> getWarrantyAvailabilityDetails();
    public WarrantyScopesResponse getAvailability(String chassis_num, String scope);
    public List<WarrantyAvailabilityDetails> getWarrantyDetailsByChassisNum(String chassisNum);
}
