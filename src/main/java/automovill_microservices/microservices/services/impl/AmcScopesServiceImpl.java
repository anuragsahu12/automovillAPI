package automovill_microservices.microservices.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.AmcScopes;
import automovill_microservices.microservices.repository.AmcScopesRepository;
import automovill_microservices.microservices.services.AmcScopesService;

@Service
public class AmcScopesServiceImpl implements AmcScopesService {
    @Autowired
    AmcScopesRepository amcScopesRepository;

    @Override
    public List<AmcScopes> getAmcScopes(){
        return amcScopesRepository.findAll();
    }
}
