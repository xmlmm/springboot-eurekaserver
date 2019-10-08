package com.mrxmgl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEurekaserverApplication.class, args);
		System.out.println("eurekaServer：----------------------------");
	}

}