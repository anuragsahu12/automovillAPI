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


import automovill_microservices.microservices.entities.WarrantyAvailability;
import automovill_microservices.microservices.others.WarrantyAvailabilityDetails;
import automovill_microservices.microservices.others.WarrantyScopesResponse;
import automovill_microservices.microservices.services.WarrantyAvailabilityService;

@CrossOrigin(value = "localhost:19000")
@RestController
@RequestMapping("api/v1/warranty-availability")
public class WarrantyAvailabilityController {
    @Autowired
    WarrantyAvailabilityService warrantyAvailabilityService;

    @GetMapping("/all")
    public List<WarrantyAvailability> getWarrantyAvailabilityDetails(){
        return warrantyAvailabilityService.getWarrantyAvailabilityDetails();
    }


    @GetMapping("/availability")
    public ResponseEntity<WarrantyScopesResponse> getAvailability(
        @RequestParam("chassis_num") String chassis_num,
        @RequestParam("scope") String scope
    ) {
        return ResponseEntity.ok(warrantyAvailabilityService.getAvailability(chassis_num, scope));
    }

    @GetMapping("/{chassisNum}")
    public List<WarrantyAvailabilityDetails> getWarrantyDetailsByChassisNum(@PathVariable String chassisNum){
        return warrantyAvailabilityService.getWarrantyDetailsByChassisNum(chassisNum);
    }
}
