package methods.pack1;

public class MethodAssignment {
	int power;
	String name = "Magnus";
	int defence;
	
	public MethodAssignment() {
		power = 20;
		//name = "Magnus";
		defence = 33;

	}
	public MethodAssignment(int a, int b, String character) {
		power = a;
		defence = b;
		name = character;
	}
	void display() {
		 System.out.println(name + "' power is " + power + " and defence is " + defence);
	 }
	
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = addFunction(a,b);
		float r = 4;
		float d = circleArea(r);
		int f = rectangleArea(a,b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		MethodAssignment obj1 = new MethodAssignment();
		obj1.display();
		MethodAssignment obj2 = new MethodAssignment(5,10, "Stacy");
		obj2.display();
	}
	
	public static int addFunction(int i1, int i2) {
		
		int result = (i1 + i2);
		
		return result;
	
	}
	
	public static float circleArea(float r) {
		float result = (3.14f * r * r);
		return result;
	}
	
	public static int rectangleArea(int i1, int i2) {
		
		int result = (i1 * i2);
		
		return result;
	
	}

}
