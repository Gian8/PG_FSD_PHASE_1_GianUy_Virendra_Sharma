package Exception;

import java.io.IOException;

public class ThrowExample {

	//public void add() throws IOException, ClassNotFoundException {
	//	throw new IOException("file i/o not found");
	//}
	void n() throws IOException {
		throw new IOException("Device error");
	}
	
	void i() throws IOException {
		n();
	}
	void g() {
		try {
			i();
		}
			catch(Exception e) {
				System.out.println("Exception handled");
				System.out.println(e.getMessage());
				System.out.println(e.getStackTrace());
				System.out.println(e.getClass());
			}
	}
	
	public static void main(String args[]) {
		ThrowExample objE = new ThrowExample();
		objE.g();
		System.out.println("Normal flow...");
	}
}
