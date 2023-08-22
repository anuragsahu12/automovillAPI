package automovill_microservices.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import automovill_microservices.microservices.entities.AmcAvailability;

public interface AmcAvailabilityRepository extends JpaRepository<AmcAvailability, Integer> {
    
}
