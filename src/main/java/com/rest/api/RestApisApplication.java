package com.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.rest.api")
public class RestApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApisApplication.class, args);
	}
}
