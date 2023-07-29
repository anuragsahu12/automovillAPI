package automovill_microservices.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import automovill_microservices.microservices.entities.Amc;

public interface AmcRepository extends JpaRepository<Amc , Integer>  {
    
}
