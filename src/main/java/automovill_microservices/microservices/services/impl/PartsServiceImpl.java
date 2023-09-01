package automovill_microservices.microservices.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.Parts;
import automovill_microservices.microservices.repository.PartsRepository;
import automovill_microservices.microservices.services.PartsService;

@Service
public class PartsServiceImpl implements PartsService{

    @Autowired
    PartsRepository partsRepository;

    @Override
    public List<Parts> getAllParts() {
        return partsRepository.findAll();
    }
    
}
