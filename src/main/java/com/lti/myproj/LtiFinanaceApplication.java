package com.lti.myproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lti.myproj")
public class LtiFinanaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LtiFinanaceApplication.class, args);
		System.out.println("Welcome to LTI Finance");
	}

}
