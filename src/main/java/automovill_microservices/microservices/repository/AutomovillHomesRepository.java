package automovill_microservices.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import automovill_microservices.microservices.entities.AutomovillHomes;


public interface AutomovillHomesRepository extends JpaRepository<AutomovillHomes, Integer> {

}
