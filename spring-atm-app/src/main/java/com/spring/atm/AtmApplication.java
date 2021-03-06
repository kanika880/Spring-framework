package com.spring.atm;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.atm.beans.SalaryAccount;
import com.spring.atm.beans.SavingsAccount;
import com.spring.atm.event.publisher.WithdrawalEventPublisher;

public class AtmApplication {

	public static void main(String[] args) {
		int accType;
	
		System.out.println("Enter 1 or 2 to select your account type: \n1. Savings account \n2.Salary account ");
		Scanner sc = new Scanner(System.in);
		accType =  sc.nextInt();
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		WithdrawalEventPublisher publisher= context.getBean("withdrawalEventPublisher", WithdrawalEventPublisher.class);
		publisher.sendWithdrawNotification(110000.0, 100000.0);
		
		switch (accType) {
		case 1:
			SavingsAccount savingsAccount = context.getBean("savingsAccount", SavingsAccount.class);
			savingsAccount.withdraw(20000.0);	
			savingsAccount.deposit(20000.0);
			break;
		case 2:
			SalaryAccount salaryAccount = context.getBean("salaryAccount", SalaryAccount.class);
			salaryAccount.withdraw(30000.0);
			salaryAccount.deposit(200000.0);
		}
		
		context.close();
	}

}
