package automovill_microservices.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.VehicleDetails;
import automovill_microservices.microservices.others.AllBasicDetails;

@Service
public interface VehicleDetailsService {
    public List<VehicleDetails> getVehicleDetails();
    // public VehicleDetails getVehicleDetailsByChassisNum1(String chassisNum);
    public AllBasicDetails getVehicleDetailsByChassisNum(String chassisNum);
}
