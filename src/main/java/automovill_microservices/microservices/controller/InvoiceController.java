package automovill_microservices.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.entities.Invoices;
import automovill_microservices.microservices.services.InvoiceService;

@RestController
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;

    @GetMapping("/getInvoices")
    public List<Invoices> getInvoices() {
        return invoiceService.getInvoices();
    }
}
