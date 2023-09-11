package automovill_microservices.microservices.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.AutomovillHomes;
import automovill_microservices.microservices.repository.AutomovillHomesRepository;
import automovill_microservices.microservices.services.AutomovillHomesService;

@Service
public class AutomovillHomesServiceImpl implements AutomovillHomesService {

    @Autowired
    AutomovillHomesRepository automovillHomesRepository;

    @Override
    public List<AutomovillHomes> getAllHomes() {
        return automovillHomesRepository.findAll();
    }
    
}
