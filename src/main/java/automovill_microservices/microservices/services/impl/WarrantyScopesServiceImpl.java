package automovill_microservices.microservices.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.WarrantyScopes;
import automovill_microservices.microservices.repository.WarrantyScopesRepository;
import automovill_microservices.microservices.services.WarrantyScopesService;

@Service
public class WarrantyScopesServiceImpl implements WarrantyScopesService {
     @Autowired
    WarrantyScopesRepository warrantyScopesRepository;

    @Override
    public List<WarrantyScopes> getWarrantyScopes(){
        return warrantyScopesRepository.findAll();
    }
}
