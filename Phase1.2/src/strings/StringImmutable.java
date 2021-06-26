package strings;

public class StringImmutable {

	public static void main(String[] args) {
		
		String s4 = "Hello";
		String s5 = "Hello";
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = new String("Hello");
		
		if(s1.equals(s4))
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
