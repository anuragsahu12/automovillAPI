package automovill_microservices.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import automovill_microservices.microservices.entities.WarrantyScopes;

public interface WarrantyScopesRepository extends JpaRepository<WarrantyScopes, Integer> {
    
}
