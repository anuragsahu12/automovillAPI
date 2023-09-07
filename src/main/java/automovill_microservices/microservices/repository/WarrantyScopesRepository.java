package automovill_microservices.microservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import automovill_microservices.microservices.entities.WarrantyScopes;

public interface WarrantyScopesRepository extends JpaRepository<WarrantyScopes, Integer> {
   List<WarrantyScopes> findByWarrantyId(int warrantyId);
}
