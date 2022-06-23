package com.cognizant.ngmichel.returnorderportal.service;

import com.cognizant.ngmichel.returnorderportal.dto.ProcessRequest;
import com.cognizant.ngmichel.returnorderportal.dto.ProcessResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name="${componentprocessing.microservice.name}")
public interface ComponentProcessingProxy {

    @GetMapping("${componentprocessing.microservice.getprocessdetail.path}")
    ProcessResponse getProcessDetail(@RequestBody ProcessRequest processRequest,
                                                            @RequestHeader(name = "Authorization", required = false) String bearerToken);
}
