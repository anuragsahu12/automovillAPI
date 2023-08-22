package automovill_microservices.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.entities.VehicleDetails;
import automovill_microservices.microservices.services.VehicleDetailsService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/vehicle")
@RequiredArgsConstructor
public class VehicleDetailsController {
    @Autowired
    VehicleDetailsService vehicleDetailsService;

    // Get a list of all vehicles
    @GetMapping("/allVehicleDetails")
    public List<VehicleDetails> getVehicleDetails(){
        return vehicleDetailsService.getVehicleDetails();
    }

    // Get vehicle details by chassis number
    @GetMapping("/{chassisNum}")
    public ResponseEntity<?> getVehicleDetails(@PathVariable String chassisNum) {
        VehicleDetails vehicleDetails = vehicleDetailsService.getVehicleDetailsByChassisNum(chassisNum);
        
        if (vehicleDetails != null) {
            return new ResponseEntity<>(vehicleDetails, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Vehicle not found.", HttpStatus.NOT_FOUND);
        }
    }
}
