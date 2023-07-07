package com.sk.group.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SkGroupApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkGroupApiGatewayApplication.class, args);
	}

}
