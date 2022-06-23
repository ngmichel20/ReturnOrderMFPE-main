package com.cognizant.ngmichel.componentprocessingmicroservice.service;

import com.cognizant.ngmichel.componentprocessingmicroservice.model.PackagingDeliverySummary;
import com.cognizant.ngmichel.componentprocessingmicroservice.model.ProcessResponse;

public interface ComponentProcessingService {
    ProcessResponse serviceProcessing(String componentType, String bearerToken);
    //PackagingDeliverySummary getPackagingDeliverySummary();
}
