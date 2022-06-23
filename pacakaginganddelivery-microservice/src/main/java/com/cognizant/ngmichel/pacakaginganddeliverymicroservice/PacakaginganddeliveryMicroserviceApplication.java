package com.cognizant.ngmichel.pacakaginganddeliverymicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.cognizant.ngmichel.packaginganddeliverymicroservice")
public class PacakaginganddeliveryMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacakaginganddeliveryMicroserviceApplication.class, args);
	}

}
