package automovill_microservices.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.entities.AmcAvailability;
import automovill_microservices.microservices.others.AmcAvailabilityDetails;
import automovill_microservices.microservices.others.ScopeResponse;
import automovill_microservices.microservices.services.AmcAvailabilityService;

@CrossOrigin(value = "localhost:19000")
@RestController
@RequestMapping("api/v1/amc-availability")
public class AmcAvailabilityController {
    @Autowired
    AmcAvailabilityService amcAvailabilityService;

    @GetMapping("/all")
    public List<AmcAvailability> getAmcAvailabilityDetails(){
        return amcAvailabilityService.getAmcAvailabilityDetails();
    }


    @GetMapping("/availability")
    public ResponseEntity<ScopeResponse> getAvailability(
        @RequestParam("chassis_num") String chassis_num,
        @RequestParam("scope") String scope
    ) {
        return ResponseEntity.ok(amcAvailabilityService.getAvailability(chassis_num, scope));
    }

    @GetMapping("/{chassisNum}")
    public List<AmcAvailabilityDetails> getAmcDetailsByChassisNum(@PathVariable String chassisNum){
        return amcAvailabilityService.getAmcDetailsByChassisNum(chassisNum);
    }
}

