package phase1.core.java;

public class AccessModifier1 {
	
	private int i = 9;
	long l = 8888;

	public void printPublic() {
		//System.out.println("printing from class AM1 package 1");
		printme();
	}
	
	protected void printProtected() {
		printme();
	}
	
	void printDefault() {
		printme();
	}
	
	public int attack(int a1, int a2) {
		int a = a1 - a2;
		return a;
	}
	
	private void printme() {
		System.out.println("printing AM1 printme");
		System.out.println("Value of private int i = " + i);
		System.out.println("Value of default long = " + l);
	}
}
