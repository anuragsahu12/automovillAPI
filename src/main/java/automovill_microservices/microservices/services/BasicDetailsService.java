package automovill_microservices.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.BasicDetails;

@Service
public interface BasicDetailsService {
    public List<BasicDetails> getBasicDetails();
}
