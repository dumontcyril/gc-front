package fr.orsys.msa.gc.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GcFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcFrontApplication.class, args);
	}

}
