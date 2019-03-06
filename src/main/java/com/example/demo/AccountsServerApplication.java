package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class AccountsServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(AccountsServerApplication.class, args);
	}
	
	@RequestMapping(value = "/")
	   public String home() {
	      return "Eureka Client application";
	   }
}
