package automovill_microservices.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.Invoices;

@Service
public interface InvoiceService {
    public List<Invoices> getInvoices();
}
