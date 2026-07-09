package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.SingletonAndPrototype.CalculatorPrototype;
import com.example.demo.SingletonAndPrototype.CalculatorSingleton;
// import config
import com.example.demo.SingletonAndPrototype.Counter;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MainApplication.class, args);
		// System.out.println("heloo world");
		// System.out.println("helooo i have made the maven project ");

		// Car car=context.getBean(Car.class);
		// car.drive();

		/*
		 * now for the singleton+statelee
		 * Calculator cal=context.getBean(Calculator.class);
		 * Calculator c2 = context.getBean(Calculator.class);
		 * 
		 * System.out.println(cal);//this is object refrences
		 * System.out.println(c2);
		 * 
		 * // com.example.demo.SingletonAndPrototype.Calculator@1b495d4
		 * // com.example.demo.SingletonAndPrototype.Calculator@1b495d4
		 * // as the output of object refrences is same means the object is shared
		 * 
		 * 
		 * System.out.println(cal.add(2, 4));
		 * System.out.println(cal.add(5,8));
		 */

		/* now for the stefull+singleton which is problem */
		/*
		 * Counter user1 = context.getBean(Counter.class);
		 * 
		 * Counter user2 = context.getBean(Counter.class);
		 * 
		 * System.out.println(user1);
		 * System.out.println(user2);
		 * 
		 * user1.increment();
		 * 
		 * System.out.println("User1 Count = " + user1.getCount());
		 * 
		 * user2.increment();
		 * 
		 * System.out.println("User2 Count = " + user2.getCount());
		 * 
		 * System.out.println("User1 Count Again = " + user1.getCount());
		 */

		// now for the prototype +statefull

		/* CalculatorPrototype user1 = context.getBean(CalculatorPrototype.class);

		CalculatorPrototype user2 = context.getBean(CalculatorPrototype.class);

		System.out.println(user1);
		System.out.println(user2);

		user1.increment();

		System.out.println("User1 = " + user1.getCount());

		user2.increment();

		System.out.println("User2 = " + user2.getCount());

		System.out.println("User1 Again = " + user1.getCount()); */

		/*  output-com.example.demo.SingletonAndPrototype.CalculatorPrototype@12fe1f28
com.example.demo.SingletonAndPrototype.CalculatorPrototype@503df2d0
User1 = 1
User2 = 1
User1 Again = 1 */

	}

}
