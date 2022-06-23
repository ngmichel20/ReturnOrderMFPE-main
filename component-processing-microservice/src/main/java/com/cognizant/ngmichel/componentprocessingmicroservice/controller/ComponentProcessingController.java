package com.cognizant.ngmichel.componentprocessingmicroservice.controller;

import com.cognizant.ngmichel.componentprocessingmicroservice.model.ProcessRequest;
import com.cognizant.ngmichel.componentprocessingmicroservice.model.ProcessResponse;
import com.cognizant.ngmichel.componentprocessingmicroservice.service.ComponentProcessingRepair;
import com.cognizant.ngmichel.componentprocessingmicroservice.service.ComponentProcessingReplacement;
import com.cognizant.ngmichel.componentprocessingmicroservice.service.ComponentProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController
public class ComponentProcessingController {

//    @Autowired
//    private ComponentProcessingService componentProcessingService;

    @Autowired
    private ComponentProcessingRepair componentProcessingRepair;

    @Autowired
    private ComponentProcessingReplacement componentProcessingReplacement;


    @GetMapping("/processDetail")
    public ResponseEntity<ProcessResponse> getProcessDetail(@RequestBody ProcessRequest processRequest,
                                                            @RequestHeader(name = "Authorization", required = false) String bearerToken) {
        System.out.println("hello");
        ProcessResponse processResponse;
        if (processRequest.getComponentType().equalsIgnoreCase("repair")) {
            processResponse = this.componentProcessingRepair.serviceProcessing(processRequest.getComponentType().toLowerCase(), bearerToken);
            System.out.println(processRequest.getComponentType());
            return ResponseEntity.ok(processResponse);
        } else if (processRequest.getComponentType().equalsIgnoreCase("replacement")) {
            processResponse = this.componentProcessingReplacement.serviceProcessing(processRequest.getComponentType().toLowerCase(), bearerToken);
            System.out.println(processRequest.getComponentType());
            return ResponseEntity.ok(processResponse);
        } else {
            System.out.println("helloWorrrld");
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/CompleteProcessing")
    public String completeProcessing(Long requestId, Long creditCardNumber, Long creditLimit, Long processingCharge,
                                     @RequestHeader(name = "Authorization", required = false) String bearerToken) {
        return "You have completed your request";
    }
}
