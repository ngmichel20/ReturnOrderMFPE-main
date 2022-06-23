package com.cognizant.ngmichel.pacakaginganddeliverymicroservice.controller;

import com.cognizant.ngmichel.pacakaginganddeliverymicroservice.model.PackagingDelivery;
import com.cognizant.ngmichel.pacakaginganddeliverymicroservice.service.PackagingDeliveryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class PackagingDeliveryController {

    @Autowired
    private PackagingDeliveryInterface packagingDeliveryInterface;

    @GetMapping("/getPackagingAndDeliveryCharge")
    public ResponseEntity<PackagingDelivery> getPackagingAndDeliveryCharge(@RequestParam String componentType,
                                                                          @RequestHeader(name = "Authorization", required = false) String bearerToken) throws Exception {

        PackagingDelivery packagingDelivery = packagingDeliveryInterface.calculatePackagingAndDeliveryCharge(componentType);
        return ResponseEntity.ok(packagingDelivery);
    }

    @GetMapping("/GetCount")
    public String getCount(@RequestParam String componentType,
                        @RequestHeader(name = "Authorization", required = false) String bearerToken) throws Exception {

        System.out.println("hello");
        PackagingDelivery packagingDelivery = packagingDeliveryInterface.calculatePackagingAndDeliveryCharge(componentType);
        return String.valueOf(packagingDelivery.getCount());
    }
}
