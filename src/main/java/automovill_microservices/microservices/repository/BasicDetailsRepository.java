package automovill_microservices.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import automovill_microservices.microservices.entities.BasicDetails;


public interface BasicDetailsRepository extends JpaRepository<BasicDetails, String> {
    BasicDetails findFirstByMakeAndModelAndFuelType(String make, String model, String fuelType);

}
