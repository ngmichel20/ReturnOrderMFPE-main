package com.cognizant.ngmichel.componentprocessingmicroservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
public class ProcessResponse {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private int requestId;
    private long processingCharge;
    @Enumerated(EnumType.ORDINAL)
    private PackagingDeliverySummary packagingDeliverySummary;
    private LocalDate dateOfDelivery;

    public ProcessResponse(long id, int requestId, long processingCharge,
                           PackagingDeliverySummary packagingDeliverySummary, LocalDate dateOfDelivery) {
        this.id = id;
        this.requestId = requestId;
        this.processingCharge = processingCharge;
        this.packagingDeliverySummary = packagingDeliverySummary;
        this.dateOfDelivery = dateOfDelivery;
    }
}

