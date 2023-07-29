package automovill_microservices.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.AmcScopes;

@Service
public interface AmcScopesService  {
    public List<AmcScopes> getAmcScopes();
}
