package automovill_microservices.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.entities.WarrantyScopes;
import automovill_microservices.microservices.services.WarrantyScopesService;

@CrossOrigin(value = "localhost:19000")
@RestController
@RequestMapping("api/v1/warranty")
public class WarrantyScopesController {
    @Autowired
    WarrantyScopesService warrantyScopesService;

    @GetMapping("/warrantyScopes")
    public List<WarrantyScopes> getWarrantyScopes(){
        return warrantyScopesService.getWarrantyScopes();
    }
}
