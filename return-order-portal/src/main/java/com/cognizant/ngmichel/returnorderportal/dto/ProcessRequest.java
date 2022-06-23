package com.cognizant.ngmichel.returnorderportal.dto;

import lombok.Data;

@Data
public class ProcessRequest {
    private long id;
    private String username;
    private long contactNumber;

    //Details of defective
    private String componentType; // Integral(Repair) or Accessory(Replacement)
    private String componentName;
    private long quantity;
}
