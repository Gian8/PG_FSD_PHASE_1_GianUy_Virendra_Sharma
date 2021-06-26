package inheritance.pack;

abstract class MNC {
	MNC(){
		System.out.println("Inside MNC constructor");
	}
	abstract void sing();
	abstract void dance();
	abstract void watch();
	void play() {
		System.out.println("Play method executes!");
	}
}
abstract class Infosys extends MNC {
	void sing() {
		System.out.println("Hallelujah");
	}
}
class Hello extends Infosys {
	void sing() {
		System.out.println("Singing from Hello");
	}
	void dance() {
		System.out.println("Dancing in the moonlight");
	}
	void watch() {
		System.out.println("Watching people dance");
	}
}
public class AbstractAssignment {
	public static void main(String args[]) {
		MNC m;
		m = new Hello();
		m.sing();
		m.dance();
		m.watch();  //cannot call normal method (in this case watch)
					//without having a normal method (watch) abstract method at parent class
		m.play();
	}
}
