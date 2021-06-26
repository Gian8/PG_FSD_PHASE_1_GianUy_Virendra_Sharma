package file.handling;

public class MultipleCatchBlock {

	public static void main(String args[]) {
		
		try {
			int a[] = new int[6];
			a[7] = 9; //will error first due to position     <---+
			a[5] = 40/0;                           //            |
		}                                          //            |
			catch(ArithmeticException e) {             //        |
				System.out.println("Arithmetic error");//        |
			}                                          //        |
			catch(ArrayIndexOutOfBoundsException e) {  //   <----+
				System.out.println("ArrayIndex error");
			} 
			catch(Exception e) {
				System.out.println("Parent exception");
			}
		finally {
		System.out.println("Rest of code");
		}
	}
}
