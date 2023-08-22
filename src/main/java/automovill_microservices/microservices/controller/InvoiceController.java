package automovill_microservices.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.entities.Invoices;
import automovill_microservices.microservices.services.InvoiceService;

@CrossOrigin(value = "localhost:19000")
@RestController
@RequestMapping("/api/v1/invoices")
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;

    @GetMapping("/allInvoices")
    public List<Invoices> getInvoices() {
        return invoiceService.getInvoices();
    }
}
