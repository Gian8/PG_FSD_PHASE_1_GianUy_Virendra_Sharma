package inheritance.pack;

interface Draw {
	int salary = 200;
	void draws();
	void shows();
}
interface Shape {
	int salary = 500;
	void shape();
	void shows();
}
interface Demo extends Shape {
}
public class InterfacePractice implements Shape, Draw {
	public void shows() {
		System.out.println("Inside shows method");
	}
	public void draws() {
		System.out.println("Inside draws method");
	}
	public void shape() {
		System.out.println("Inside shape method");
	}
	public static void main(String args[]) {
		InterfacePractice i = new InterfacePractice();
		i.shape();
		i.draws();
		i.shows();
		
		Draw d = new InterfacePractice();
		System.out.println(d.salary);
		Shape s = new InterfacePractice();
		System.out.println(s.salary);
	}
}
