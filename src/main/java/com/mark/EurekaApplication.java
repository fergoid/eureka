package com.mark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RestController

public class EurekaApplication {

	  @RequestMapping("/")
	  public String home() {
	    return "Hello World";
	  }
	 
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}
}
