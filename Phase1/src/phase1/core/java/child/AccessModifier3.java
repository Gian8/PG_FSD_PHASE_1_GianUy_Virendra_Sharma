package phase1.core.java.child;

import phase1.core.java.AccessModifier1;

public class AccessModifier3 extends AccessModifier1 {
	void defaultMethod() {
		System.out.println("inside the default method of class AM3");
	}

		public static void main(String[] args) {
			new AccessModifier1().printPublic();
			//new AccessModifier1().printProtected();
		}
}
