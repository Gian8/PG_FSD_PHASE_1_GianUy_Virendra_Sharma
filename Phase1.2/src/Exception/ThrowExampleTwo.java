package Exception;

import java.util.Scanner;

public class ThrowExampleTwo {

	static int mult(int x, int y) {
		if(x > 500) {
		throw new ArithmeticException("The number is too high! ERROR!");
		} else {
			System.out.println("Both numbers are good!");
		} return 
			x*y;
	}
	
	public static void main(String args[]) {
		int result = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int x = s.nextInt();
		System.out.println("Enter 2nd number: ");
		int y = s.nextInt();
		s.close();
		
		try {
			result = mult(x, y);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Result is: " + result);
	}
}
