package automovill_microservices.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import automovill_microservices.microservices.entities.Users;

import java.util.Optional;



public interface UserRepository extends JpaRepository<Users, String> {
       
       Optional <Users> findByUsername(String username);
}
