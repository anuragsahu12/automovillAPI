package automovill_microservices.microservices.services.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import automovill_microservices.microservices.services.InvoiceIdGeneratorService;

@Service
public class InvoiceIdGeneratorServiceImpl implements InvoiceIdGeneratorService {

    private LocalDate currentDate = LocalDate.now();
    private int counter = 1;

    @Override
    public String generateInvoiceId(int workshopID) {
        LocalDate today = LocalDate.now();
        
        if (!today.equals(currentDate)) {
            currentDate = today;
            counter = 1;
        }
        String formattedDate = currentDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String invoiceID = String.format("%05d", workshopID) + formattedDate  + String.format("%04d", counter);
        counter++;

        return invoiceID;
    }
    
}
