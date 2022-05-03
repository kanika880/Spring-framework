package com.spring.standard.events.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringEventHandlingApplication {
	public static void main(String[] args) {
		System.out.println("Demonstrating built-in events in Spring::");		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		
		context.refresh();	
		context.stop();	
		context.start();	
		context.close();
	}
}
