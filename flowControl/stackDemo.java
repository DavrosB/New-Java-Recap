package flowControl;

public class stackDemo {
	
	public static void firstMethod(String testString) {
		
		System.out.println("This is the first method " + testString);
		secondMethod(testString);
		
	}
	
	
	public static void secondMethod(String testString) {
		
		System.out.println("This is the second method " + testString);
		thirdMethod(testString);
		
		
	}
	
	public static void thirdMethod(String testString) {
	
		System.out.println("This is the third method " + testString);
		
}	
	
}
	

