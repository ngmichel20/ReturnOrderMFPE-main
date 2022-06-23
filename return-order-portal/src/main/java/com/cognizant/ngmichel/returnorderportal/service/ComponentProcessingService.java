package com.cognizant.ngmichel.returnorderportal.service;

import com.cognizant.ngmichel.returnorderportal.dto.ProcessRequest;
import com.cognizant.ngmichel.returnorderportal.dto.ProcessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

@Service
public class ComponentProcessingService {

    @Autowired
    private ComponentProcessingProxy componentProcessingProxy;

    public ProcessResponse getProcessDetail(ProcessRequest processRequest, String bearerToken) {
        System.out.println(processRequest.toString());
        System.out.println("ss " + bearerToken);
        try {
            System.out.println("bonjour");
            return this.componentProcessingProxy.getProcessDetail(processRequest, bearerToken);
        } catch (Exception e) {
            return null;
        }
    }

}
