package phase1.core.java;

public class AccessModifier2 {

	public static void main(String[] args) {
		//AccessModifier1 access = new AccessModifier1();
		//access.print();
		
		//new AccessModifier1().print();  //shorthand notation, used when calling only once
		new AccessModifier1().printPublic();
		AccessModifier1 am = new AccessModifier1();
		am.printPublic();
		am.printProtected();                             
		am.printDefault();
		
		new AccessModifier1().printProtected();
		new AccessModifier1().printDefault();
		System.out.println("Instant print of Value of long" + new AccessModifier1().l);
		
		AccessModifier1 a1 = new AccessModifier1();
				System.out.println(a1.attack(10, 5));
				//or you can create another _ to store value
				int f = a1.attack(10, 2);
				System.out.println(f);
	}
	public void methodPublic() {
		System.out.println("AM2 methodPublic");
	}
	
	protected void methodProtected() {
		System.out.println("AM2 methodProtected");
	}
	
	void methodDefault() {
		System.out.println("AM2 methodDefault");
	}
	
	private void methodPrivate() {
		System.out.println("AM2 methodPrivate");
	}

}
