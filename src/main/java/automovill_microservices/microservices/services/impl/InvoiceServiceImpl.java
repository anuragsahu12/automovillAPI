package automovill_microservices.microservices.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.Invoices;
import automovill_microservices.microservices.repository.InvoiceRepository;
import automovill_microservices.microservices.services.InvoiceService;


@Service
public class InvoiceServiceImpl implements InvoiceService{

    @Autowired
    InvoiceRepository invoiceRepository;
    
    @Override
    public List<Invoices> getInvoices() {
        return invoiceRepository.findAll();
    }
    

    
}
