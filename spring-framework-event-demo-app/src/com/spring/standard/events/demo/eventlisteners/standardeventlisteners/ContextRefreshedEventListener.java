package com.spring.standard.events.demo.eventlisteners.standardeventlisteners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent>{
public static boolean applicationContextInitialized=false;
@Override
public void onApplicationEvent(ContextRefreshedEvent refresh) {
	if (applicationContextInitialized==false) {
		System.out.println("ApplicationContext initialized");
		
	}else
	System.out.println("Application refreshed.");
}
}
