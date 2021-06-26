package inner.classes;

public class AnonymousInnerClass {
	
	static Demo d = new Demo() {
		void show () {
			super.show();
			System.out.println("I'm in secret class");
		}
	};
	
	public static void main(String[] args) {
		d.show();
	}

}

class Demo {
	
	void show() {
	System.out.println("I am in show method of super class");
	}
}