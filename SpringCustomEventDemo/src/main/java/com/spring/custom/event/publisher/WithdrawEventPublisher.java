package com.spring.custom.event.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.spring.custom.event.WithdrawEvent;

public class WithdrawEventPublisher implements ApplicationEventPublisherAware {
	 private ApplicationEventPublisher applicationEventPublisher;
	 
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
		
	}
	
	public void sendWithdrawNotification(final Double amount, final Double accBalance) {
		WithdrawEvent event= new WithdrawEvent(this, amount, accBalance);
		applicationEventPublisher.publishEvent(event);
	} 
	

}
