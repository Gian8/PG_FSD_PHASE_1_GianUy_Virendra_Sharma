package Exception;

import java.util.Scanner;

public class Throw {

	static int add(int a, int b) {
		if (a > 100) {
			throw new ArithmeticException("Number is too big!");
		} else {
			System.out.println("Both numbers are within parameter");
		} return a+b;
	}
	
	public static void main(String[] args) {
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int a = scanner.nextInt();
		System.out.println("Enter number 2: ");
		int b = scanner.nextInt();
		System.out.println("closing scanner...");
		scanner.close();
		System.out.println("Scanner closed successfully!");
		
		try {
			result = add(a,b);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		} System.out.println("Result is: " + result);
	}
}
