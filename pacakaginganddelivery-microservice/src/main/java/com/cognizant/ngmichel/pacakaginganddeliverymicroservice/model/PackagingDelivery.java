package com.cognizant.ngmichel.pacakaginganddeliverymicroservice.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public enum PackagingDelivery {

    //Packaging items
    INTEGRAL_ITEM("IntegralItem",100),  //Repair
    ACCESSORY("Accessory",50),          //Replacement
    PROTECTIVE_SHEATH("ProtectiveSheath",50),

    //Delivery items
    DELIVERY_CHARGE_INTEGRAL_ITEM("DC_Integral",200),
    DELIVERY_CHARGE_ACCESSORY("DC_Accessory",100),

    TOTAL("Total", 0);

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;
    private int inrValue;
    private int count;

    PackagingDelivery(String name, int inrValue) {
        this.name = name;
        this.inrValue = inrValue;
    }

    PackagingDelivery() {
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public int getInrValue() {
        return inrValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInrValue(int inrValue) {
        this.inrValue = inrValue;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
