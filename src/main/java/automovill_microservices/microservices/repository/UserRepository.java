package automovill_microservices.microservices.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import automovill_microservices.microservices.entities.Users;

public interface UserRepository extends JpaRepository<Users, String> {
    
    public Optional<Users> findByUsername(String username);
}
