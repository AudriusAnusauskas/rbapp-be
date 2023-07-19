package com.rbarticles.rbappbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RbappBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RbappBeApplication.class, args);
	}
	@GetMapping("/")
	public String appRoot(){
		return "Hello, Motherfucker!";
	}
}
