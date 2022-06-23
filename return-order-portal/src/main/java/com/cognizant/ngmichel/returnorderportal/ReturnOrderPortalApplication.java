package com.cognizant.ngmichel.returnorderportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.cognizant.ngmichel.returnorderportal")
public class ReturnOrderPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReturnOrderPortalApplication.class, args);
	}

}
