package com.cognizant.ngmichel.pacakaginganddeliverymicroservice.service;

import com.cognizant.ngmichel.pacakaginganddeliverymicroservice.model.PackagingDelivery;

public interface PackagingDeliveryInterface {
    PackagingDelivery calculatePackagingAndDeliveryCharge(String componentType) throws Exception;
}
