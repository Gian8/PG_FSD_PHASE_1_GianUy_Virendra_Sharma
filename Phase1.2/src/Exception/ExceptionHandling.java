package Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int a [] = new int [6];
			a[8]=8;
			
		}
			catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception occurs");
			}
			catch (ArrayIndexOutOfBoundsException e){
							System.out.println("ArrayIndexOutOfBound Exception occurs");
			}
			catch (Exception e) {
				
			}
		

	}

}
