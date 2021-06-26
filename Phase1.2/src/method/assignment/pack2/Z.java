package method.assignment.pack2;

import method.assignment.pack1.M;
import method.assignment.pack1.N;
import method.assignment.pack1.P;

public class Z extends M
{
	public static void main(String[] args) 
	{
		M m = new M();
		m.run();
	//	m.display();// doesn't work, DEFAULT only works in all class in same package
	//	m.print(); //doesn't work, PRIVATE only works inside the class
		m.show(); 
		M.show(); //static way to access show method

		N n = new N();
		n.run();
	//	n.display();// doesn't work, DEFAULT only works in all class in same package
	//	n.print(); //doesn't work, PRIVATE only works inside the class
	//	n.show();//doesn't work, although show method is protected, Z class is not child of N class
	
		P p = new P();
		p.run();
	//	p.display();// doesn't work, DEFAULT only works in all class in same package
	//	p.print(); //doesn't work, PRIVATE only works inside the class
	//	p.show();//doesn't work, although show method is protected, Z class is not child of P class
		
		X x = new X();
//		System.out.println(x.xIPrivate);//doesn't work, private.
		x.xIPrivate(); //calling private int from class x via method inside class x
		System.out.println(x.xLDefault);
		System.out.println(x.xCPublic);
		System.out.println(x.xFProtected);
	}
}
