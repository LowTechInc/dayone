package com.lowtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.lowtech")
public class DayOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(DayOneApplication.class, args);
	}
}
