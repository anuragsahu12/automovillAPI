package automovill_microservices.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import automovill_microservices.microservices.entities.Users;

public interface UserRepository extends JpaRepository<Users, String> {
    
}
