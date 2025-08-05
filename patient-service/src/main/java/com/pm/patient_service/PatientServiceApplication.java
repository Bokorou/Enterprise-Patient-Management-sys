package com.pm.patient_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientServiceApplication.class, args);
	}

}

// Having some issues with the docker containers - mainly getting the postgresql container to work.
//Probably best to re-watch the docker part of the video or try to configure the docker containers from scratch