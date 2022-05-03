package com.spring.standard.events.demo.eventlisteners.standardeventlisteners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent>{


	@Override
	public void onApplicationEvent(ContextClosedEvent closed) {
		System.out.println("application closed");
		
	}
	

}
