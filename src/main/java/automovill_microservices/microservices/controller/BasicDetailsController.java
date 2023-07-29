package automovill_microservices.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.entities.BasicDetails;
import automovill_microservices.microservices.services.BasicDetailsService;

@RestController
public class BasicDetailsController {
    @Autowired
    BasicDetailsService basicDetailsService;

    @GetMapping("/getBasicDetails")
    public List<BasicDetails> getBasicDetails(){
        return basicDetailsService.getBasicDetails();
    }
}
