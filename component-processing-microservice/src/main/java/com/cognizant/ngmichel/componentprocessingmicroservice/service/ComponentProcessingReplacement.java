package com.cognizant.ngmichel.componentprocessingmicroservice.service;

import com.cognizant.ngmichel.componentprocessingmicroservice.model.PackagingDeliverySummary;
import com.cognizant.ngmichel.componentprocessingmicroservice.model.ProcessResponse;
import com.cognizant.ngmichel.componentprocessingmicroservice.repository.ProcessResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ComponentProcessingReplacement implements ComponentProcessingService{

    @Autowired
    private PackagingDeliveryProxy packagingDeliveryProxy;

    @Autowired
    private ProcessResponseRepository processResponseRepository;

    @Override
    public ProcessResponse serviceProcessing(String componentType, String bearerToken) {
        ProcessResponse processResponse = new ProcessResponse();
        processResponse.setRequestId((int) (Math.random() * 10000));
        processResponse.setProcessingCharge(300);
        LocalDate date = LocalDate.now().plusDays(2);
        processResponse.setDateOfDelivery(date);
        processResponse.setPackagingDeliverySummary(this.packagingDeliveryProxy.getPackagingAndDeliveryCharge(componentType, bearerToken));
        this.processResponseRepository.save(processResponse);
        return processResponse;
    }

//    @Override
//    public PackagingDeliverySummary getPackagingDeliverySummary() {
//        return packagingDeliveryProxy.getPackagingAndDeliveryCharge();
//    }
}
