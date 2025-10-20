package com.fiorella.springcloud.msvc_vehicles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsvcVehiclesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsvcVehiclesApplication.class, args);
	}

}
