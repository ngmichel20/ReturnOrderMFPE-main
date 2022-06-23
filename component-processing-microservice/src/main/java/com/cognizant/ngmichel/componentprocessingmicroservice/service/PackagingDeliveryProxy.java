package com.cognizant.ngmichel.componentprocessingmicroservice.service;

import com.cognizant.ngmichel.componentprocessingmicroservice.model.PackagingDeliverySummary;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "${packaginganddelivery.microservice.name}")
public interface PackagingDeliveryProxy {
    @GetMapping("${packaginganddelivery.getpackaging.path}")
    PackagingDeliverySummary getPackagingAndDeliveryCharge(@RequestParam String componentType,
                                                           @RequestHeader(name = "Authorization", required = false)
                                                                   String bearerToken);
}
