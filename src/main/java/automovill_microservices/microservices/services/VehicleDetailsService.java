package automovill_microservices.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.VehicleDetails;

@Service
public interface VehicleDetailsService {
    public List<VehicleDetails> getVehicleDetails();
}
