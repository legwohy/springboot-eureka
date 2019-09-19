package com.cobra.boot.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * eureka客户端
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderApplication.class, args);
	}




}
