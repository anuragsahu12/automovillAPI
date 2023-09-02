package automovill_microservices.microservices.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import automovill_microservices.microservices.entities.AmcAvailability;



public interface AmcAvailabilityRepository extends JpaRepository<AmcAvailability, Integer> {
    Optional<AmcAvailability> findByChassisNumAndScopeOfWork(String chassisNum, String scopeOfWork);
    List<AmcAvailability> findByChassisNum(String chassisNum);

    
}
