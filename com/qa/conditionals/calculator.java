package com.qa.conditionals;

public class calculator {
	
//	// Exercise - Calculator Exercise // 
//	- 4 Methods, one for addition, subtraction,
//	multiplication and division // - Each Method
//	takes in 2 paramaters (Ints or floats) 
// - Each method returns the sum of the 2 
//	paramaters // - If a sum will work out as 
//	negative return that the sum cannot be done 
//	(e.g 5 - 7 ) // - If a sum will be divided 
//	by 0 return back that it cannot be done 
//	(e.g 7/0)
//	int a;
//	int b;
//	boolean ok;
//	
//	int result;
//	boolean noSum = false;

	public static int add(int a, int b, boolean x) {
		int result=0;
		if (x==true) {
			 result = a+b+b;
			 System.out.println(a + " + " + b + " + " + b +" = " + result);
		}
		else {
		 result = a+b;
		System.out.println(a + " + " + b + " = " + result);
		}
		return result;
	}
	
	public static int sub(int a, int b) {
		int result =0;
		
		if (b>a) {
			System.out.println("Second number too high");
			System.out.println(a + " - " + b);
		}else {
			result = a-b;
			System.out.println(a + " - " + b + " = " + result);
	}
		return result;
		
	}
		
		
	public static int mult(int a, int b) {
		int result = a*b;
		System.out.println(a + " * " + b + " = " + result);
		return result;
	}
	
	public static int div(int a, int b) {
			int result=0;
			if (a == 0) {
				System.out.println("Can't divide into zero");
			}
			else if (b == 0) {
				System.out.println("Can't divide by zero");
			} else {
				 result = a/b;
				 System.out.println(a + " / " + b + " = " + result);
			}	
			return result;
		}
			
	
}

