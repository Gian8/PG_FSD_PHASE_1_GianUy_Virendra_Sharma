package method.assignment.pack1;

public class P 
{
	public static void main(String[] args) {
		M m = new M();
	//	System.out.println(m.mI); //doesn't work because mI is private
		m.mI(); //class P can only print private variable of M via an M method that calls it locally
 		System.out.println(m.mFProtected);//PROTECTED works in all class in same package and child class
		System.out.println(m.mLDefault);//DEFAULT works in all class in same package
		
		N n = new N();
		System.out.println(n.nDDefault);//DEFAULT works in all class in same package
		System.out.println(n.nLProtected);//PROTECTED works in all class in same package and child class 
		System.out.println(n.nIPublic);//Public works anywhere
	}
	public void run() 
	{
		System.out.println("Hello from class P PUBLIC run method!");
	}
	void display() 
	{
		System.out.println("Hello from class P DEFAULT display method!");
	}
	private void print() 
	{
		System.out.println("Hello from class P PRIVATE print method");
	}
	protected static void show()  //made static to be accessible by classes outside package
	{
		System.out.println("Hello from class P PROTECTED show method");
	}
}
