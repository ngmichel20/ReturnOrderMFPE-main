package com.cognizant.ngmichel.componentprocessingmicroservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class ProcessRequest {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String username;
    private long contactNumber;

    //Details of defective
    private String componentType; // Integral(Repair) or Accessory(Replacement)
    private String componentName;
    private long quantity;

    public ProcessRequest(long id, String username, long contactNumber, String componentType, String componentName, long quantity) {
        this.id = id;
        this.username = username;
        this.contactNumber = contactNumber;
        this.componentType = componentType;
        this.componentName = componentName;
        this.quantity = quantity;
    }
}
