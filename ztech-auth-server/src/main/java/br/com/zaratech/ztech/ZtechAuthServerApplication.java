package br.com.zaratech.ztech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ZtechAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZtechAuthServerApplication.class, args);
	}
}