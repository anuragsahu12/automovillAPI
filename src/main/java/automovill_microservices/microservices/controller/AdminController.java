package automovill_microservices.microservices.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.others.AddNewVehicleRequest;
import automovill_microservices.microservices.services.AdminService;


@CrossOrigin(value = "localhost:19000")
@RestController
@RequestMapping("api/v1/admin")
public class AdminController {
    

    @Autowired
    AdminService adminService;

    @PostMapping("/addNewVehicle")
    public void addNewVehicle(
        @RequestBody AddNewVehicleRequest request
    ) {
        adminService.initializeNewVehicleData(request);
    }
}
