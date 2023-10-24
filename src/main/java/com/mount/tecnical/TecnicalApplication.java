package com.mount.tecnical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TecnicalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TecnicalApplication.class, args);
	}

}
