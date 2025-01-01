package com.sister.tugas15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tugas15Application {

	@GetMapping("/msg")
	public String msg() {
		return "Hello from Azure Web App - Cloud Computing Tugas 15";
	}

	public static void main(String[] args) {
		SpringApplication.run(Tugas15Application.class, args);
	}

}
