package com.cognizant.ngmichel.pacakaginganddeliverymicroservice.service;

import com.cognizant.ngmichel.pacakaginganddeliverymicroservice.model.PackagingDelivery;
import com.cognizant.ngmichel.pacakaginganddeliverymicroservice.repository.PackagingDeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackagingDeliveryImpl implements PackagingDeliveryInterface {

    @Autowired
    private PackagingDeliveryRepository packagingDeliveryRepository;

    @Override
    public PackagingDelivery calculatePackagingAndDeliveryCharge(String componentType) throws Exception {
        PackagingDelivery packagingDelivery;
        System.out.println(componentType);
        if (componentType.equalsIgnoreCase("repair")) {
            packagingDelivery = PackagingDelivery.TOTAL;
            int integralItemInrValue = PackagingDelivery.INTEGRAL_ITEM.getInrValue();;
            int deliveryChargeIntegralItemInrValue = PackagingDelivery.DELIVERY_CHARGE_INTEGRAL_ITEM.getInrValue();
            packagingDelivery.setCount(integralItemInrValue + deliveryChargeIntegralItemInrValue);
            //this.packagingDeliveryRepository.save(packagingDelivery);
            return packagingDelivery;
        } else if(componentType.equalsIgnoreCase("replacement")){
            packagingDelivery = PackagingDelivery.TOTAL;
            int accessoryInrValue = PackagingDelivery.ACCESSORY.getInrValue();;
            int deliveryChargeAccessoryInrValue = PackagingDelivery.DELIVERY_CHARGE_ACCESSORY.getInrValue();
            packagingDelivery.setCount(accessoryInrValue + deliveryChargeAccessoryInrValue);
            //this.packagingDeliveryRepository.save(packagingDelivery);
            return packagingDelivery;
        }
        throw new Exception("ere");
    }
}
