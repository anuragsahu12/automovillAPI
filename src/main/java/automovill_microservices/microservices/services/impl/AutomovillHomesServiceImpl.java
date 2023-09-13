package automovill_microservices.microservices.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.AutomovillHomes;
import automovill_microservices.microservices.entities.Workshops;
import automovill_microservices.microservices.repository.AutomovillHomesRepository;
import automovill_microservices.microservices.repository.WorkshopsRepository;
import automovill_microservices.microservices.services.AutomovillHomesService;

@Service
public class AutomovillHomesServiceImpl implements AutomovillHomesService {

    @Autowired
    AutomovillHomesRepository automovillHomesRepository;

    @Autowired
    WorkshopsRepository workshopsRepository;

    @Override
    public List<AutomovillHomes> getAllHomes() {
        return automovillHomesRepository.findAll();
    }

    @Override
    public AutomovillHomes getByWorkshopId(String workshopName) {

        Workshops workshop = workshopsRepository.findFirstByName(workshopName);
        
        return automovillHomesRepository.findFirstByState(workshop.getState());
    }
    
    
}
