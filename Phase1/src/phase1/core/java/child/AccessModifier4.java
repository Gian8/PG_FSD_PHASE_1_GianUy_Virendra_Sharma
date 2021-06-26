package phase1.core.java.child;

import phase1.core.java.AccessModifier2;

public class AccessModifier4 extends AccessModifier2{

		public static void main(String[] args) {
			new AccessModifier2().methodPublic(); //works
			//new AccessModifier2().methodPrivate(); //doesnt work
			//new AccessModifier2().methodDefault(); //doesnt work
			new AccessModifier4().methodProtected();
		}
}
