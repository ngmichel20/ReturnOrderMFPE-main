package com.cognizant.ngmichel.componentprocessingmicroservice.model;

import javax.persistence.Entity;

public enum PackagingDeliverySummary {
    //Packaging items
    INTEGRAL_ITEM("IntegralItem",100),  //Repair
    ACCESSORY("Accessory",50),          //Replacement
    PROTECTIVE_SHEATH("ProtectiveSheath",50),

    //Delivery items
    DELIVERY_CHARGE_INTEGRAL_ITEM("DC_Integral",200),
    DELIVERY_CHARGE_ACCESSORY("DC_Accessory",100),

    TOTAL("Total", 0);

    private String name;
    private int inrValue;
    private int count;

    PackagingDeliverySummary(String name, int inrValue) {
        this.name = name;
        this.inrValue = inrValue;
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
