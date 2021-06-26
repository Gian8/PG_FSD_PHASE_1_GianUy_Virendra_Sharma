package polymorphism;

class Vehicle {
	int speed = 35;
	long distance = 10;
	Vehicle(){   //default constructor
		System.out.println("Inside default Vehicle Constructor");
	}
	Vehicle(int v){ //constructor with parameter
		System.out.println("Inside parameterized v constructor" + v);
	}
	void run () {
		System.out.println("Vehicle run method");
	}	
	void stop() {
		System.out.println("Vehicle stop method");
	}	
	public void fuel(int fInt) {
		System.out.println("default fuel method: " + fInt);
	}	
	public void fuel(float fFloat, String fString) {
		System.out.println("default fuel method: " + fFloat + fString);
	}
	public void fuel(char fChar, int fInt2) {
		System.out.println("Default fuel method: " + fChar + fInt2);
	}	
}
class TwoWheeler extends Vehicle {
	int speed = 55;
	long distance = 20;
	int nos_of_tire = 2;
	TwoWheeler(){ //default constructor	
		System.out.println("inside default constructor of TwoWheeler");
	}
	@Override
	void run() {
		System.out.println("2W run method");
	}
	@Override
	void stop() {
		System.out.println("2W stop method");
	}
	void display() {
		System.out.println("This vehicle has " + nos_of_tire + " wheels and is travelling " + distance + " miles to the promised land at speed of " + speed + " miles per hour");
		System.out.println("Parent vehicle speed: " + super.speed);
		System.out.println("Parent vehicle distance: " + super.distance);
	}	
}
class ThreeWheeler extends Vehicle {
	int speed = 25;
	long distance = 5;
	int nos_of_tire = 3;
	ThreeWheeler(){ //default constructor	
		System.out.println("inside default constructor of ThreeWheeler");
	}
	@Override
	public void run() {
		System.out.println("3W run method");
	}
	@Override
	public void stop() {
		System.out.println("3W stop method");
	}
	 void display() {
		System.out.println("This vehicle has " + nos_of_tire + " wheels and is travelling " + distance + " miles to the promised land at speed of " + speed + " miles per hour");
		System.out.println("Parent vehicle speed: " + super.speed);
		System.out.println("Parent vehicle distance: " + super.distance);
	}	
}
class FourWheeler extends Vehicle {
	int speed = 70;
	long distance = 40;
	int nos_of_tire = 4;
	FourWheeler(){ //default constructor
		System.out.println("inside default constructor of FourWheeler");
	}
	@Override
	void run() {
		System.out.println("4W run method");
	}
	@Override
	void stop() {
		System.out.println("4W stop method");
	}
	 void display() {
		System.out.println("This vehicle has " + nos_of_tire + " wheels and is travelling " + distance + " miles to the promised land at speed of " + speed + " miles per hour");
		System.out.println("Parent vehicle speed: " + super.speed);
		System.out.println("Parent vehicle distance: " + super.distance);
	}	
}
class EightWheeler extends Vehicle {
	int speed = 60;
	long distance = 1350;
	int nos_of_tire = 8;
	EightWheeler(){ //default constructor	
		System.out.println("inside default constructor of EightWheeler");
	}
	@Override
	void run() {
		System.out.println("8W run method");
	}
	@Override
	void stop() {
		System.out.println("8W stop method");
	}
	void display() {
		System.out.println("This vehicle has " + nos_of_tire + " wheels and is travelling " + distance + " miles to the promised land at speed of " + speed + " miles per hour");
		System.out.println("Parent vehicle speed: " + super.speed);
		System.out.println("Parent vehicle distance: " + super.distance);
	}	
}
class PolymorphismAssignment {
	public static void main(String args[]) {
		Vehicle v; //parent class reference
		
		v = new TwoWheeler(); //calling methods using polymorphism
		v.run();
		v.stop();
		TwoWheeler twoW = new TwoWheeler();
		twoW.display();
		
		v = new ThreeWheeler();
		v.run();
		v.stop();
		ThreeWheeler threeW = new ThreeWheeler();
		threeW.display();
		
		v = new FourWheeler();
		v.run();
		v.stop();
		FourWheeler fourW = new FourWheeler();
		fourW.display();
		
		v = new EightWheeler();
		v.run();
		v.stop();
		EightWheeler eightW = new EightWheeler();
		eightW.display();
		
		Vehicle g = new Vehicle(); //new object g to call methods inside vehicle parent class
		g.run();
		g.stop();
		g.fuel(20);
		g.fuel(17.5f, "Shell");
		g.fuel('S', 26);
		
		Vehicle g2 = new Vehicle(88);
		
		System.out.println(g.speed); // calling variable speed of vehicle parent class
		
		EightWheeler g8 = new EightWheeler();
		g8.run();
	}
}

