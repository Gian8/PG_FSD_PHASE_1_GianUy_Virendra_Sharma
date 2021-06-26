package Exception;

import java.util.Scanner;

public class CalculationAssignment {
	
	public static void main(String args[]) {
		//CalculationAssignment ca = new CalculationAssignment();
		int result = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Type the length of the rectagle: ");
		int l = s.nextInt();
		System.out.println("Type the Width of the rectagle: ");
		int b = s.nextInt();
		s.close();
		try {
			result = calculate(l, b);
		//} catch(ArithmeticException e) {
		//	System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Result is: " + result);
	}
	
	public static int calculate(int l, int b) {
		try {
		areaFunc(l, b);
		} catch(Exception e) {
			System.out.println("Exception found and dealt with");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.out.println(e.getClass());
		}
		return l*b;
	}
	
	static void areaFunc(int l, int b) {
		display(l, b);
	}
	
	static int display(int l, int b) {
		if(l > b) {
			throw new ArithmeticException("Length is longer than Breadth");
		} else {
			System.out.println("Area of rectangle is found!");			
		} return
			l*b;
	}
}

