package automovill_microservices.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.entities.Amc;
import automovill_microservices.microservices.services.AmcService;

@RestController
public class AmcController {
    @Autowired
    AmcService amcService;

    @GetMapping("/getAmc")
    public List<Amc> getAmcDetails(){
        return amcService.getAmcDetails();
    }
}
