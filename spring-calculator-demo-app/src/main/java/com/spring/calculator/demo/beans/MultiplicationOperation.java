package com.spring.calculator.demo.beans;

public class MultiplicationOperation {
	private int num1;
	private int num2;
	
	public MultiplicationOperation() {
		super();
		
	}

	public MultiplicationOperation(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void showOperands() {
		System.out.println("MultiplicationOperation [num1=" + num1 + ", num2=" + num2 + "]");
	}
	
	public int multiply() {
		return num1 * num2;
	}
	
	//public int multiply(int...numbers) {
		//int sum=0;
		
	//	for (int num: numbers) {
		//	sum += num;
		//}
		
//		return sum;
		
		//TODO:Replace the body with single line of code.
	//return Arrays.stream(numbers).reduce(0,(product,num)->product * num);
	//}
	

}
