package automovill_microservices.microservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import automovill_microservices.microservices.entities.AmcScopes;

public interface AmcScopesRepository extends JpaRepository<AmcScopes, Integer> {
   List<AmcScopes> findByAmcId(int amcId);
}
