package com.spring.atm.event;

import java.text.SimpleDateFormat;
import org.springframework.context.ApplicationEvent;

public class WithdrawalEvent extends ApplicationEvent {
	String message;
	private double accBalance;
	private double amount;
	/**
	 * 
	 */
	private static final long serialVersionUID = 5675529506367939604L;

	public WithdrawalEvent(Object source, Double amount, Double accBalance) {
		super(source);
		this.amount=amount;
		this.accBalance=accBalance;
		
	}

	public String message() {
		
		return String.format(
				"""
				Your account is debited by Rs. %.2f on %s. 
				The updated balance is Rs. %.2f.
				If not done by you, call support.""",
				amount, 
				new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(this.getTimestamp()),
				accBalance);
					
		
	}

	
	

}
