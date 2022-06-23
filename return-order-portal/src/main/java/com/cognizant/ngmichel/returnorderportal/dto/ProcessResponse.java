package com.cognizant.ngmichel.returnorderportal.dto;


import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
public class ProcessResponse {
    private long id;
    private int requestId;
    private long processingCharge;
    private PackagingDeliverySummary packagingDeliverySummary;
    private LocalDate dateOfDelivery;
}
