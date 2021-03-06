package com.spring.custom.event;

import java.text.SimpleDateFormat;


import org.springframework.context.ApplicationEvent;

public class WithdrawEvent extends ApplicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4113146068172370674L;
	
	private double amount;
	private double accBalance;

	private String accHolder;
	
	public WithdrawEvent(Object source, Double amount, Double accBalance, String accHolder) {
		super(source);
		this.amount= amount;
		this.accBalance=accBalance;
		this.accHolder=accHolder;
	}
	public String message() {		
		return String.format(
				"""
				Dear %s Rs. %.2f was withdrawn from your bank account on %s. 
				The remaining account balance is %.2f. 
				If this transaction was not done by you, please contact support.""", 
				    accHolder,
					amount,
					new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(this.getTimestamp()),
					accBalance);
					
		
	}
	
	
	
	
	
}
