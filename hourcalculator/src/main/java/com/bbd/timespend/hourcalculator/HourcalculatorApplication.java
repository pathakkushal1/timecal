package com.bbd.timespend.hourcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HourcalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(HourcalculatorApplication.class, args);
	}

}
