package com.tcs.ratingServic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RatingServicApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingServicApplication.class, args);
	}

}
