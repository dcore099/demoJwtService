package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.web.*"})
public class RestTestImagesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTestImagesApplication.class, args);
	}

}
