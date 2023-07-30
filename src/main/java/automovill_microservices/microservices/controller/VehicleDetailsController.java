package automovill_microservices.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.entities.VehicleDetails;
import automovill_microservices.microservices.services.VehicleDetailsService;

@RestController
public class VehicleDetailsController {
    @Autowired
    VehicleDetailsService vehicleDetailsService;

    @GetMapping("/getVehicleDetails")
    public List<VehicleDetails> getVehicleDetails(){
        return vehicleDetailsService.getVehicleDetails();
    }
}
