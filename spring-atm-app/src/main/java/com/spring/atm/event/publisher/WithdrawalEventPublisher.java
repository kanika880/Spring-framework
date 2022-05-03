package com.spring.atm.event.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.spring.atm.event.WithdrawalEvent;


public class WithdrawalEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher= applicationEventPublisher;
		
	}
	
	public void sendWithdrawNotification(final Double amount, final Double accBalance) {
		WithdrawalEvent event= new WithdrawalEvent(this, amount, accBalance);
		applicationEventPublisher.publishEvent(event);
	} 
}
	


