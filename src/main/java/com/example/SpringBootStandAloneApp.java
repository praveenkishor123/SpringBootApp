package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
 
 
@EnableAutoConfiguration
@ComponentScan("com.websystique.springboot")
public class SpringBootStandAloneApp {
	
	//Spring Boot @EnableAutoConfiguration attempts to automatically 
	//configure your Spring application based on the jar dependencies that you have added.
 
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStandAloneApp.class, args);
        
    }
}

