package com.mngtofinformationsys.project.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableResourceServer
public class ProjectDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDetailsApplication.class, args);
	}

}
