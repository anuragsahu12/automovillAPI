package automovill_microservices.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.entities.AmcScopes;
import automovill_microservices.microservices.services.AmcScopesService;

@RestController
@RequestMapping("api/v1/amc")
public class AmcScopesController {
    @Autowired
    AmcScopesService amcScopesService;

    @GetMapping("/amcScopes")
    public List<AmcScopes> getAmcScopes(){
        return amcScopesService.getAmcScopes();
    }
}
