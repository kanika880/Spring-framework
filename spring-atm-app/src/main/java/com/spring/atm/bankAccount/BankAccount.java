package com.spring.atm.bankAccount;

public abstract class BankAccount {
	private int accNum;
	private String accHolder;
	private double accBalance;
	

	public BankAccount(int accNum, String accHolder, double accBalance) {
		super();
		this.accNum = accNum;
		this.accHolder = accHolder;
		this.accBalance = accBalance;
	}

	public double showBalance() {
		System.out.println("The account balance is " +accBalance);
		return accBalance;
	}
	
	public double withdraw(double amount) {
		return amount;		
	}
	
	public double deposit(double amount) {
		return amount;		
	}

	
	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [accNum=" + accNum + ", accHolder=" + accHolder + ", accBalance=" + accBalance + "]";
	}
	
	
	
	

}
