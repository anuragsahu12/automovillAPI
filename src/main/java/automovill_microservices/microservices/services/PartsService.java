package automovill_microservices.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.Parts;

@Service
public interface PartsService {
    public List<Parts> getAllParts();
}
