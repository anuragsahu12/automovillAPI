package automovill_microservices.microservices.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.AmcAvailability;
import automovill_microservices.microservices.entities.AmcScopes;
import automovill_microservices.microservices.entities.WarrantyAvailability;
import automovill_microservices.microservices.entities.WarrantyScopes;
import automovill_microservices.microservices.others.AddNewVehicleRequest;
import automovill_microservices.microservices.repository.AmcAvailabilityRepository;
import automovill_microservices.microservices.repository.AmcScopesRepository;
import automovill_microservices.microservices.repository.WarrantyAvailabilityRepository;
import automovill_microservices.microservices.repository.WarrantyScopesRepository;
import automovill_microservices.microservices.services.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    WarrantyScopesRepository warrantyScopesRepository;

    @Autowired
    AmcScopesRepository amcScopesRepository;

    @Autowired
    WarrantyAvailabilityRepository warrantyAvailabilityRepository;

    @Autowired
    AmcAvailabilityRepository amcAvailabilityRepository;


    @Override
    public void initializeNewVehicleData(AddNewVehicleRequest request) {
        String chassisNum = request.getChassis_num();
        int warrantyId = request.getWarranty_id();
        int amcId = request.getAmc_id();

        List<WarrantyScopes> scopesWarranty = warrantyScopesRepository.findByWarrantyId(warrantyId);
        List<AmcScopes> scopesAmc = amcScopesRepository.findByAmcId(amcId);

        // Add warranty scopes
        for(WarrantyScopes scope : scopesWarranty) {
            WarrantyAvailability temp = WarrantyAvailability.builder()
                                            .chassisNum(chassisNum)
                                            .consumed(0)
                                            .details(scope.getDetails())
                                            .scopeOfWork(scope.getScopeOfWork())
                                            .frequency(scope.getFrequency())
                                            .warranty_id(warrantyId)
                                            .build();
            // System.out.println(temp);
            warrantyAvailabilityRepository.save(temp);               
        }
        
        // Add AMC scopes
        for(AmcScopes scope : scopesAmc) {
            AmcAvailability temp = AmcAvailability.builder()
                                            .chassisNum(chassisNum)
                                            .consumed(0)
                                            .details(scope.getDetails())
                                            .scopeOfWork(scope.getScopeOfWork())
                                            .frequency(scope.getFrequency())
                                            .amc_id(warrantyId)
                                            .build();
            // System.out.println(temp);
            amcAvailabilityRepository.save(temp);               
        }
    }
}