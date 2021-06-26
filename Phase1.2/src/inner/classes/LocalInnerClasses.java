package inner.classes;

public class LocalInnerClasses {

	private int age = 90;
	
	void dis() {
		System.out.println("inside dis method");
	}
	
	void outerMethod() {
		System.out.println("inside outerMethod");
		
		class Inner{
			void innerMethod() {
				dis();
				System.out.println("inside innerMethod: " + age);
			}
		}
		Inner y = new Inner();
		y.innerMethod();
	}
	public void f() {}
}
