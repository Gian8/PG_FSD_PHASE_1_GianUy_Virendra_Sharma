package method.assignment.pack1;

public class M 
{
	private int mIPrivate = 1;
	long mLDefault = 123544564352L;
	protected float mFProtected = 8.5f;
	
	public void mI()
	{
		System.out.println(mIPrivate);
	}
	public void run() 
	{
		System.out.println("Hello from class M PUBLIC run method!");
	}
	void display() 
	{
		System.out.println("Hello from class M DEFAULT display method!");
	}
	private void print() 
	{
		System.out.println("Hello from class M PRIVATE print method");
	}
	protected static void show() //made static to be accessible by classes outside package
	{
		System.out.println("Hello from class M PROTECTED show method");
	}	
}
