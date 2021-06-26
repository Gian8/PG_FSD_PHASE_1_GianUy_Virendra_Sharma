package method.assignment.pack1;

public class N 
{
	public int nIPublic = 2;
	protected long nLProtected = 99999988222L;
	double nDDefault = 6797337D;
	
	public void run() 
	{
		System.out.println("Hello from class N PUBLIC run method!");
	}
	void display() 
	{
		System.out.println("Hello from class N DEFAULT display method!");
	}
	private void print() 
	{
		System.out.println("Hello from class N PRIVATE print method");
	}
	protected static void show()  //made static to be accessible by classes outside package
	{
		System.out.println("Hello from class N PROTECTED show method");
	}
}
