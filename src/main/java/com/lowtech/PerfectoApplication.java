package com.lowtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.lowtech")
public class PerfectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerfectoApplication.class, args);
	}
}
