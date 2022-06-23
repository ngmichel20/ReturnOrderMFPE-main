package com.cognizant.ngmichel.componentprocessingmicroservice.repository;

import com.cognizant.ngmichel.componentprocessingmicroservice.model.ProcessRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessRequestRepository extends JpaRepository<ProcessRequest, Long> {

}
