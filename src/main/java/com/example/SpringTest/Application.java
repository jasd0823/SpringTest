package com.example.SpringTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	// method to download an image from a url and save it to a local file
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
