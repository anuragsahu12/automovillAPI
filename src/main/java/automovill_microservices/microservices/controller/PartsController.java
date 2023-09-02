package automovill_microservices.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.entities.Parts;
import automovill_microservices.microservices.services.PartsService;
import lombok.RequiredArgsConstructor;

@CrossOrigin(value = "localhost:19000")
@RestController
@RequestMapping("/api/v1/parts")
@RequiredArgsConstructor
public class PartsController {
    @Autowired
    PartsService partsService;

    @GetMapping("/allParts")
    public List<Parts> getAllParts() {
        return partsService.getAllParts();
    }
}
