package automovill_microservices.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import automovill_microservices.microservices.entities.VehicleDetails;

public interface VehicleDetailsRepository extends JpaRepository<VehicleDetails, String> {
    
}
