package com.spring.calculator.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.calculator.demo.beans.AdditionOperation;
import com.spring.calculator.demo.beans.MultiplicationOperation;
import com.spring.calculator.demo.beans.SubtractionOperation;

public class MenuDrivenCalculatorApplication {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context-config.xml");
		
		AdditionOperation adder = context.getBean("additionOperation", AdditionOperation.class);
		adder.showOperands();
		System.out.println("Sum =" +adder.add());
		
		System.out.println("Sum of more than two numbers=" +adder.add(1,2,3,4,5));
		
		//Subtraction
		SubtractionOperation sub = context.getBean("subtractionOperation", SubtractionOperation.class);
		sub.showOperands();
		System.out.println("Diff =" +sub.subtract());
		
		//multiplication
		MultiplicationOperation multiplier= context.getBean("multiplicationOperation", MultiplicationOperation.class);
		multiplier.showOperands();
		System.out.println("Product = " +multiplier.multiply());
		//System.out.println("Product of other numbers=" +multiplier.multiply(3,4,6,7));
		
		context.close();
	}
	
}
