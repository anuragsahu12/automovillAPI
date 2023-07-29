package automovill_microservices.microservices.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.BasicDetails;
import automovill_microservices.microservices.repository.BasicDetailsRepository;
import automovill_microservices.microservices.services.BasicDetailsService;

@Service
public class BasicDetailsServiceImpl implements BasicDetailsService {
    @Autowired
    BasicDetailsRepository basicDetailsRepository;

    @Override
    public List<BasicDetails> getBasicDetails() {
        
        return basicDetailsRepository.findAll();
    }

    
}
