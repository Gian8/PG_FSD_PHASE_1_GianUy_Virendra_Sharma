package inner.classes;

public class MethodLocalInnerClass {
	
	public static void main(String[] args) {
		Outer o = new Outer();
		o.outerMethod();
		//MethodLocalInnerClass.Outer obj = o.new Outer(); <-- doesn't work, only if main is in same class as class obj.
		//obj.innerMethod();
	}

}

class Outer {
	
	private int age = 33;
	
	void display() {
		System.out.println("HELLO!");
	}
	
	void outerMethod() {
	System.out.println("inside outermethod");
		
	class Inner {
		void innerMethod() {
			display(); //able to get other method of mother class
			System.out.println("inside innermethod " + age); //able to get variable of mother class
		}
	}
	Inner b = new Inner(); //obj class of local innerclass must be created after inner class but inside method
	b.innerMethod();
	}
}
