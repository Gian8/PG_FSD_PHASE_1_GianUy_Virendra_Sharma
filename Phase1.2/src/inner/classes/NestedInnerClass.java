package inner.classes;

public class NestedInnerClass {
	/* <outer class>.<inner class> <name> = <object of outer class>.new<inner class>();
	 * A obj = new A(); --> object of outer class
	 * A.B obj2 = obj.new B(); --> object of inner class
	 */

	private int num1 = 50;
	private int num2 = 10;
	
	void display() {
		System.out.println("Printing from outerclass display method");
	}
	void msg() {
		System.out.println("First number is: " + num1);
	}
	
	class InnerClass {
			
		private int num2 = 33;
			
		void display() {
		System.out.println("Printing from innerclass display method");
		msg();
		}
	}
	
	class InnerClass2 {
		void display() {
			System.out.println("inside IC2");
		}
	}
	protected class IC4 {
		void display() {
			System.out.println("Printing inside IC4");
		}
	}
	
	private class IC3 {
		void display() {
			System.out.println("inside IC3");
		}
	}
	
	public static void main(String[] args) {
		
		NestedInnerClass outerClass = new NestedInnerClass();
		outerClass.display();
		NestedInnerClass.InnerClass obj = outerClass.new InnerClass();
		obj.display();
		System.out.println(obj.num2);
		
		NestedInnerClass.InnerClass2 obj2 = outerClass.new InnerClass2();
		obj2.display();
		
		NestedInnerClass.IC3 obj3 = outerClass.new IC3();
		obj3.display();
		NestedInnerClass.IC4 puppy = outerClass.new IC4();
		puppy.display();
		//obj.msg(); <-- this doesn't work, obj can only call inside inner class
	}
}
