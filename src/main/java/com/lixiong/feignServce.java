package com.lixiong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class feignServce {

	public static void main(String[] args) {
		SpringApplication.run(feignServce.class, args);
	}

}
