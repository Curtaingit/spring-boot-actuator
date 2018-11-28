package com.curtain.springactuatorclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringActuatorClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActuatorClientApplication.class, args);
	}
}
