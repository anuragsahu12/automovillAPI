package automovill_microservices.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.entities.AmcAvailability;
import automovill_microservices.microservices.services.AmcAvailabilityService;

@RestController
@RequestMapping("api/v1/amc-availability")
public class AmcAvailabilityController {
    @Autowired
    AmcAvailabilityService amcAvailabilityService;

    @GetMapping("/all")
    public List<AmcAvailability> getAmcAvailabilityDetails(){
        return amcAvailabilityService.getAmcAvailabilityDetails();
    }
}

