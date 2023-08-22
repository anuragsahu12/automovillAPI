package automovill_microservices.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.entities.BasicDetails;
import automovill_microservices.microservices.services.BasicDetailsService;

@CrossOrigin(value = "localhost:19000")
@RestController
@RequestMapping("/api/v1/basic")
public class BasicDetailsController {
    @Autowired
    BasicDetailsService basicDetailsService;

    @GetMapping("/allDetails")
    public List<BasicDetails> getBasicDetails(){
        return basicDetailsService.getBasicDetails();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBasicDetails(@PathVariable String id){
        BasicDetails basicDetails = basicDetailsService.getBasicDetailsById(id);

        if(basicDetails != null){
            return new ResponseEntity<>(basicDetails, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Details Not Found", HttpStatus.NOT_FOUND);
        }
    }

}
