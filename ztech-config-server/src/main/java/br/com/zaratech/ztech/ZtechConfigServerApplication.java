package br.com.zaratech.ztech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ZtechConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZtechConfigServerApplication.class, args);
	}
}