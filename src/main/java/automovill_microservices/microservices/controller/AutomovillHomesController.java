package automovill_microservices.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.entities.AutomovillHomes;
import automovill_microservices.microservices.services.AutomovillHomesService;
import lombok.RequiredArgsConstructor;

@CrossOrigin(value = "localhost:19000")
@RestController
@RequestMapping("/api/v1/automovill-homes")
@RequiredArgsConstructor
public class AutomovillHomesController {

    @Autowired
    AutomovillHomesService automovillHomesService;

    @GetMapping("/allHomes")
    public List<AutomovillHomes> getAllHomes() {
        return automovillHomesService.getAllHomes();
    }


    // @PostMapping("/addNew")
    // public ResponseEntity<InvoiceResponse> createInvoice(
    //     @RequestBody InvoiceRequest request
    // ) {
    //     return ResponseEntity.ok(invoiceService.createInvoice(request));
    // }
    

    // @GetMapping("/{chassisNum}")
    // public List<InvoiceDetailsChassis> getInvoicesByChassisNum(@PathVariable String chassisNum){
    //     return invoiceService.getInvoiceDetailsByChassisNum(chassisNum);
    // }
}

