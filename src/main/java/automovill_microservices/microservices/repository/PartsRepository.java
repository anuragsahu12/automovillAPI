package automovill_microservices.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import automovill_microservices.microservices.entities.Parts;

public interface PartsRepository extends JpaRepository<Parts, Integer> {
    
}
