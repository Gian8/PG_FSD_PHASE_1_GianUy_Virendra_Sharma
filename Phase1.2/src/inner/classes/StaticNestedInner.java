package inner.classes;

public class StaticNestedInner {
	
	static int c = 5;

	private static void outerMethod() {
		System.out.println("inside outerMethdod");
	}
	
	static class inner {
		public static void main(String[] args) {
			System.out.println("inside inner class method... " + c);
			outerMethod();
		}
	}
}
