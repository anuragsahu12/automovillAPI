package automovill_microservices.microservices.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.Amc;
import automovill_microservices.microservices.repository.AmcRepository;
import automovill_microservices.microservices.services.AmcService;

@Service
public class AmcServiceImpl implements AmcService {
    @Autowired
    AmcRepository amcRepository;

    @Override
    public List<Amc> getAmcDetails(){
        return amcRepository.findAll();
    }
}
