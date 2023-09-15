package automovill_microservices.microservices.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.others.AddNewVehicleRequest;
import automovill_microservices.microservices.others.AddNewWorkshopRequest;
import automovill_microservices.microservices.services.AdminService;


@CrossOrigin(value = "localhost:19000")
@RestController
@RequestMapping("api/v1/admin")
public class AdminController {
    

    @Autowired
    AdminService adminService;

    @PostMapping("/addNewVehicle")
    public ResponseEntity<String> addNewVehicle(
        @RequestBody AddNewVehicleRequest request
    ) {
        try {
            adminService.initializeNewVehicleData(request);
            return new ResponseEntity<String>("Added Successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("Failed", HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/addNewWorkshop")
    public ResponseEntity<String> addNewWorkshop(
        @RequestBody AddNewWorkshopRequest request
    ) {
        try {
            adminService.initializeNewWorkshop(request);
            return new ResponseEntity<String>("Added Successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("Failed, recheck you data.", HttpStatus.BAD_REQUEST);
        }
    }



}
