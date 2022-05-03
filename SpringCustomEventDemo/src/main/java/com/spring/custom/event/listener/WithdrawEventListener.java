package com.spring.custom.event.listener;

import org.springframework.context.ApplicationListener;

import com.spring.custom.event.WithdrawEvent;

public class WithdrawEventListener implements ApplicationListener<WithdrawEvent>{

	@Override
	public void onApplicationEvent(WithdrawEvent event) {
		System.out.println("Sending withdrawal notification SMS...");
		System.out.println(event.message());
		System.out.println("Message sent!");
		
		
		
	}
	

}
