package assignments.pack;

public class MethodsAndConstructors {
	int id;
	String name;
	
	public MethodsAndConstructors() { //constructor (ONLY VALID inside same class!)
		id = 10;
		name = "Gian";
		System.out.println("Printing inside constructor ListPractice!"); //will need a 
		//method to display id and name
	}
	void display() { //method to display constructor,
		//will need to be called
		System.out.println(id + " " + name);
	}
	public MethodsAndConstructors(int i, String n) { //will execute role of value assigned to object
		id = i;
		name = n;
	}
	
		public static void main (String[] args) {
			int a = 19;
			int b = 8;
			int c = minFunction(a, b);
			System.out.println("Smaller Value is = " + c);
			
			new MethodsAndConstructors().display(); //"quick" object calling to call method display
			
			MethodsAndConstructors identification = new MethodsAndConstructors(); //object created to call display
			identification.display();
			MethodsAndConstructors identification2 = new MethodsAndConstructors(6, "Gabby");
			identification2.display();
		}
		
		public static int minFunction(int g1, int g2) {
			int min;
			
			if (g1 > g2) {
				min = g2;
			}
			else {
				min = g1;
			}
			return min;
		}
}
