package com.spring.atm.beans;

import java.text.SimpleDateFormat;

import java.time.LocalDateTime;
import com.spring.atm.bankAccount.BankAccount;

public class SalaryAccount extends BankAccount {

	public SalaryAccount(int accNum, String accHolder, double accBalance) {
		super(accNum, accHolder, accBalance);
		
	}
	
	@Override
	public double withdraw(double amount) {
		System.out.println("salary acount");
		if (amount > 100000.0) {			
			System.out.println("Maximum withdrawal limit reached.");
		}else if (amount > getAccBalance()) {
			System.out.println("You have insufficient balance to withdraw. ");
		}else {
			String.format(
					"""
						Dear %s Your account is debited by Rs. %.2f on %s. 
						The updated balance is Rs. %.2f.
						If not done by you, call support.""",
						getAccHolder(),
						amount, 
						new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(LocalDateTime.now()),
						getAccBalance());
						
		}
		
		return (double) getAccBalance();
		
	}

	@Override
	public double deposit(double amount) {
			System.out.println("Transaction successful");
		
	
		return amount;
		
	}

}
