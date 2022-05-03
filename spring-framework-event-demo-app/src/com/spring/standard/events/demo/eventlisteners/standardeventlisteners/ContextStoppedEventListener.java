package com.spring.standard.events.demo.eventlisteners.standardeventlisteners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStoppedEventListener implements ApplicationListener<ContextStoppedEvent>{

	@Override
	public void onApplicationEvent(ContextStoppedEvent stop) {
		System.out.println("Application refreshed.");
		
	}
	

}
