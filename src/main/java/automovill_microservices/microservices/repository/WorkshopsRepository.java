package automovill_microservices.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import automovill_microservices.microservices.entities.Workshops;


public interface WorkshopsRepository extends JpaRepository<Workshops, Integer> {

}
