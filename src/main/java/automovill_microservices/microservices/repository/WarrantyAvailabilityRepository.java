package automovill_microservices.microservices.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import automovill_microservices.microservices.entities.WarrantyAvailability;

public interface WarrantyAvailabilityRepository extends JpaRepository<WarrantyAvailability, Integer > {
    Optional<WarrantyAvailability> findByChassisNumAndScopeOfWork(String chassisNum, String scopeOfWork);
    List<WarrantyAvailability> findByChassisNum(String chassisNum);
}
