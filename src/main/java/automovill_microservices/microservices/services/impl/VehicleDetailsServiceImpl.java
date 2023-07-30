package automovill_microservices.microservices.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.VehicleDetails;
import automovill_microservices.microservices.repository.VehicleDetailsRepository;
import automovill_microservices.microservices.services.VehicleDetailsService;

@Service
public class VehicleDetailsServiceImpl implements VehicleDetailsService {
    @Autowired
    VehicleDetailsRepository vehicleDetailsRepository;
    
    public List<VehicleDetails> getVehicleDetails(){
        return vehicleDetailsRepository.findAll();
    }    
}
