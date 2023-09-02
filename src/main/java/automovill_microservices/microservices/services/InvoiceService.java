package automovill_microservices.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.Invoices;
import automovill_microservices.microservices.others.InvoiceRequest;
import automovill_microservices.microservices.others.InvoiceResponse;

@Service
public interface InvoiceService {
    public List<Invoices> getInvoices();
    public InvoiceResponse createInvoice(InvoiceRequest request);
    public List<Invoices> getInvoiceDetailsByChassisNum(String chassisNum);
}
