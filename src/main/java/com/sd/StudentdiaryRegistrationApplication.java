package com.sd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentdiaryRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentdiaryRegistrationApplication.class, args);
	}

}
