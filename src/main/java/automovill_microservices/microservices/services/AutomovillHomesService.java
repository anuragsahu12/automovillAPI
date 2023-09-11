package automovill_microservices.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.AutomovillHomes;

@Service
public interface AutomovillHomesService {
   public List<AutomovillHomes> getAllHomes(); 
}
