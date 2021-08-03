package com.qa.conditionals;

public class Runner {
	
	public static void main(String[] args) {
		
		System.out.println("Add numbers");
		calculator.add(10,6, false);
		System.out.println("-----------------");
		
		System.out.println("Subtract numbers");
		calculator.sub(25,36);
		System.out.println("-----------------");
		
		System.out.println("Multiply numbers");
		calculator.mult(10,5);
		System.out.println("-----------------");
		
		
		System.out.println("Divide numbers");
		calculator.div(60,10);
		System.out.println("-----------------");
		
	}

}
