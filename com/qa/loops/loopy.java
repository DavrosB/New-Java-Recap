package com.qa.loops;

public class loopy {
	
	public static void whileLoop() {
		
		int a = 100;
		while (a<=200) {
			
			System.out.println("Value of a is " + a);
			a++;
		}
		
	}

	public static void whileLoop2() {
		
		int a =100;
		
		while(a <= 200) {
			
			if (a%2 == 0) {
				
				System.out.println("Value is " + a + " -");
			}
			else {
				System.out.println("Value is " + a + " *");
			}
			a++;
		}
			
	}
	
	
	public static void printTen() {
		
		int num=1;
		while (num<=10) {
		for(int i=0; i<=10; i++) {
			System.out.println("Print ten times " + num);
		}
		num++;
			
		}
	}
	
	public static void change(double cost, int note) {
		
		int tenners=0;
		int fivers=0;
		int pounds=0;
		int fifty=0;
		int twenty=0;
		int ten=0;
		int five=0;
		int two=0;
		int one=0;
		double change;
		//double change=100;
		change = note - cost;
		System.out.println("You spent £" + cost + " paid for with £" + note);
		
		while (change > 0) {
			//count number of tenners in change
			if (change>=10 ) {
				tenners++;
				change-=10;
				
			}
			else if (change>=5 ) {
				fivers++;
				change-=5;
				
			}
			else if (change>=1 ) {
				pounds++;
				change-=1;
				
			}
			
			else if (change>=0.5 ) {
				fifty++;
				change-=0.5;
				
			}
			
		}	
		
		System.out.println("£10 x " + tenners);
		System.out.println("£5 x " + fivers);
		System.out.println("£1 x " + pounds);
		System.out.println("50p x " + fifty);
	}
	
	
	public static void fizzBuzz() {
		int times = 0;
		int num = 1;
		while (times < 100) {
			
			if ((num % 3 == 0) && (num % 5 == 0)) {
				System.out.println("Number " + num + " FizzBuzz");
				
				
			}	
				else if	(num % 3 == 0) {
					System.out.println("Number " + num + " Fizz");
					
				
			}
			
				else if	(num % 5 == 0) {
					System.out.println("Number " + num + " Buzz");
					
			}
				else {
					System.out.println("Number isn't Fizz or Buzz its " + num);
				}
			times++;
			num++;
		}
		
	}
	
	
	
	
	
	
	
}