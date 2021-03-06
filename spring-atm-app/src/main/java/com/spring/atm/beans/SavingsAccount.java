package com.spring.atm.beans;

import com.spring.atm.bankAccount.BankAccount;

public class SavingsAccount extends BankAccount {
 
	public SavingsAccount(int accNum, String accHolder, double accBalance) {
		super(accNum, accHolder, accBalance);
		
	}

	@Override
	public double withdraw(double amount) {
		System.out.println("Savings account");
		if (amount > 30000) {
			System.out.println("Maximum withdrawal limit reached.");
		}else if (amount > getAccBalance()) {
			System.out.println("You have insufficient balance to withdraw. ");
		}else {
			System.out.println("Withdrawal successful. Your account balance is " +this.showBalance());					
		}
		
		return (double) getAccBalance();
		
	}

	@Override
	public double deposit(double amount) {
		if (amount > 1000000) {
			System.out.println("Maximum transaction limit reached.");
		}else {
			System.out.println("Transaction successful");
		}
	
		return amount;
		
	}


	
}
