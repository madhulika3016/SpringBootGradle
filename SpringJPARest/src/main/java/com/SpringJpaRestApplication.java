package com;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class SpringJpaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaRestApplication.class, args);
		
		//new File(FileUploadController.uploadDirectory).mkdir();
		System.out.println("Connected to database");
	}

}
