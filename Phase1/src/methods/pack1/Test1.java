package methods.pack1;

public class Test1 {
	public static void main (String[] args) {
		int a = 1;
		int b = 2;
		int c = minFunction(a,b);
		System.out.println("Minimum Value = " + c);
	}
	
	public static int minFunction(int i1, int i2) {
		int min;
		
		if (i1>i2)
			min=i2;
		else
			min = i1;
		return min;
	}
}
