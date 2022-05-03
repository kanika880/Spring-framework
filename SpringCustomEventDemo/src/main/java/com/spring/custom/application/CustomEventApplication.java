package com.spring.custom.application;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.custom.event.publisher.WithdrawEventPublisher;

public class CustomEventApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		WithdrawEventPublisher publisher = context.getBean("withdrawEventPublisher", WithdrawEventPublisher.class);
		publisher.sendWithdrawNotification(5000.0, 15000.0);
		context.close();
	}

}
