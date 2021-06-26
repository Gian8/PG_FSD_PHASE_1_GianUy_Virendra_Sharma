package file.handling;

public class NestedTryBock {

	public static void main(String args[]) {
		
		try {
			checkException();
		}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic error");
			}
			finally {
				System.out.println("Printing outside method");
			}
	}
	
	public static void checkException() {
		
		try {
			int result = 3 / 0;
		}
			finally {
				System.out.println("Printing inside method");
			}
	}
}
