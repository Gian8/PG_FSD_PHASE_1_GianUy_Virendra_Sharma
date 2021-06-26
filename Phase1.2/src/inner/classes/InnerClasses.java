package inner.classes;

public class InnerClasses {
	
	private int data = 20;
	
	static void display() {
		System.out.println("Printing inside outer class method");
	}
	
	class Inner{
		private int data = 5;
		
		void msg() {
			System.out.println("Printing inside inner class msg method " + data);
		}
		void display() {
			System.out.println("Printing inside inner class display method");
		}
	}
	public static void main(String[] args) {
		InnerClasses obj = new InnerClasses();
		InnerClasses.Inner in = obj.new Inner();
		in.msg();
		in.display();
		display();
	}
}
