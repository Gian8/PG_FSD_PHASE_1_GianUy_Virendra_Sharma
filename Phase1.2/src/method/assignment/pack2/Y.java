package method.assignment.pack2;

import method.assignment.pack1.M;
import method.assignment.pack1.N;

public class Y extends N
{
	public static void main(String[] args) 
	{
		M m = new M();
		m.run();
	//	m.display();// doesn't work, DEFAULT only works in all class in same package
	//	m.print(); //doesn't work, PRIVATE only works inside the class
	//	m.show(); doesn't work, although show method is protected, Y class is not child of M class
		
		N n = new N();
		n.run();
	//	n.display();// doesn't work, DEFAULT only works in all class in same package
	//	n.print(); //doesn't work, PRIVATE only works inside the class
		n.show();
		N.show(); //Accessing show method in static way
		
		X x = new X();
//		System.out.println(x.xIPrivate);//doesn't work, private.
		x.xIPrivate(); //calling private int from class x via method inside class x
		System.out.println(x.xLDefault);
		System.out.println(x.xCPublic);
		System.out.println(x.xFProtected);
	}
}
