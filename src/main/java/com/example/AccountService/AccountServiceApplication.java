package com.example.AccountService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AccountServiceApplication {

	@RequestMapping("/")
	public String home(){
		return "Hello to Account Service";
	}

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}

}
