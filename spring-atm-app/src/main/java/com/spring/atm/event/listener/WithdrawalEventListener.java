package com.spring.atm.event.listener;

import org.springframework.context.ApplicationListener;

import com.spring.atm.event.WithdrawalEvent;

public class WithdrawalEventListener implements ApplicationListener<WithdrawalEvent>{

	@Override
	public void onApplicationEvent(WithdrawalEvent event) {
		System.out.println("Sending withdrawal message");
		System.out.println(event.message());
		System.out.println("Message sent!");
		
	}

	

}
