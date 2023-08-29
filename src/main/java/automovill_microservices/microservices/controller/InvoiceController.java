package automovill_microservices.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.entities.Invoices;
import automovill_microservices.microservices.others.InvoiceRequest;
import automovill_microservices.microservices.others.InvoiceResponse;
import automovill_microservices.microservices.services.InvoiceService;
import lombok.RequiredArgsConstructor;

@CrossOrigin(value = "localhost:19000")
@RestController
@RequestMapping("/api/v1/invoices")
@RequiredArgsConstructor
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;

    @GetMapping("/allInvoices")
    public List<Invoices> getInvoices() {
        return invoiceService.getInvoices();
    }


    @PostMapping("/addNew")
    public ResponseEntity<InvoiceResponse> createInvoice(
        @RequestBody InvoiceRequest request
    ) {
        return ResponseEntity.ok(invoiceService.createInvoice(request));
    }
}
