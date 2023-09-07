package automovill_microservices.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;
import automovill_microservices.microservices.entities.WarrantyScopes;

@Service
public interface WarrantyScopesService {
    public List<WarrantyScopes> getWarrantyScopes();
}
