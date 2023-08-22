package automovill_microservices.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.entities.Amc;
import automovill_microservices.microservices.services.AmcService;

@CrossOrigin(value = "localhost:19000")
@RestController
@RequestMapping("api/v1/amc")
public class AmcController {
    @Autowired
    AmcService amcService;

    @GetMapping("/details")
    public List<Amc> getAmcDetails(){
        return amcService.getAmcDetails();
    }
}
