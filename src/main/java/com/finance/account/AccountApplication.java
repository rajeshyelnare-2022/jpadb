package com.finance.account;

import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.finance.account")
@ComponentScan(basePackages = { "com.finance.account" })
@EntityScan("com.finance.account.*")   
public class AccountApplication {


	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	
	}

}
