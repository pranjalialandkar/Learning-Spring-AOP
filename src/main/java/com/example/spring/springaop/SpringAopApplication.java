package com.example.spring.springaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.spring.springaop.business.BusinessService1;
import com.example.spring.springaop.business.BusinessService2;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {
	
	Logger logger = LoggerFactory.getLogger(getClass());

	private BusinessService1 businessService1;

	private BusinessService2 businessService2;

	public SpringAopApplication(BusinessService1 businessService1, BusinessService2 businessService2) {
		super();
		this.businessService1 = businessService1;
		this.businessService2 = businessService2;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("BusinessService1 Result: " + businessService1.calculateMax());
		logger.info("BusinessService2 Result: " + businessService2.calculateMin());
		
	}

}
