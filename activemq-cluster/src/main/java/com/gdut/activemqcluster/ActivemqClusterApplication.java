package com.gdut.activemqcluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ActivemqClusterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivemqClusterApplication.class, args);
	}

}
