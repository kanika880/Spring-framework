package com.spring.standard.events.demo.eventlisteners.standardeventlisteners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartedEventListener implements ApplicationListener<ContextStartedEvent>{


@Override
public void onApplicationEvent(ContextStartedEvent arg0) {
	System.out.println("Application refreshed.");
	
}
}
