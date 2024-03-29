package com.power.smarttrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SmarttrackApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SmarttrackApplication.class, args);
	}
}
