package automovill_microservices.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.Amc;

@Service
public interface AmcService {
    public List<Amc> getAmcDetails();
}
