package automovill_microservices.microservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import automovill_microservices.microservices.entities.Invoices;

public interface InvoiceRepository extends JpaRepository<Invoices, String> {
    List<Invoices> findByChassisNum(String chassis_num);
}
