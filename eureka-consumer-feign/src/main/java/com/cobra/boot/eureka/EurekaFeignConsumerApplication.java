package com.cobra.boot.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



/**
 * eureka的客户端
 */
@EnableFeignClients("com.cobra.boot.eureka.service")
@SpringBootApplication
public class EurekaFeignConsumerApplication
{

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignConsumerApplication.class, args);
	}



}
