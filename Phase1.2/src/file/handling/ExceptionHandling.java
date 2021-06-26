package file.handling;

public class ExceptionHandling {

	public static void main(String args[]) {
		int num1, num2, num3;
		num1 = 20;
		num2 = 0;
		
		try {
			num3 = num1/num2;
			System.out.println("1st number divided by 2nd is: " + num3);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Numbers can't be divided by zero");
		}
		catch(Exception ae1) {
			System.out.println("I'm before subclass exception");
		}
		finally {
			System.out.println("This will always get executed!");
		}
		
		num3 = num1 + num2;
		System.out.println("1st number added to 2nd is: " + num3);
	}
}
