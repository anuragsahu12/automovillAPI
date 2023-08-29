package automovill_microservices.microservices.services;

import org.springframework.stereotype.Service;

@Service
public interface InvoiceIdGeneratorService {
    public String generateInvoiceId(int workshopID);
}
