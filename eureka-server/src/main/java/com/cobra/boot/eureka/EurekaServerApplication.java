package com.cobra.boot.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动一个服务注册中心
 * 默认情况下 server也是一个client
 * 尽量提供一个空的服务作为注册 让提供者注册进来 可以根据端口做负载
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
