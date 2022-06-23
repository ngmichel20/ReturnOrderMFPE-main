package com.cognizant.ngmichel.componentprocessingmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.cognizant.ngmichel.componentprocessingmicroservice")
public class ComponentProcessingMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentProcessingMicroserviceApplication.class, args);
	}

}
