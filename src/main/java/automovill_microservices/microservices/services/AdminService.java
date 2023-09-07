package automovill_microservices.microservices.services;


import org.springframework.stereotype.Service;

import automovill_microservices.microservices.others.AddNewVehicleRequest;


@Service
public interface AdminService  {
    public void initializeNewVehicleData(AddNewVehicleRequest request);
}
