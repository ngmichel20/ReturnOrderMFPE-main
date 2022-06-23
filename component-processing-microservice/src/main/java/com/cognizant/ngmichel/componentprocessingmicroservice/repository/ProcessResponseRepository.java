package com.cognizant.ngmichel.componentprocessingmicroservice.repository;

import com.cognizant.ngmichel.componentprocessingmicroservice.model.ProcessResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessResponseRepository extends JpaRepository<ProcessResponse, Long> {
}
