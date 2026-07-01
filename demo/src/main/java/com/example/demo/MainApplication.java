package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(MainApplication.class, args);
		// System.out.println("heloo world");
		// System.out.println("helooo i have made the maven project ");

		Car car=context.getBean(Car.class);
		car.drive();
		
	}

}
