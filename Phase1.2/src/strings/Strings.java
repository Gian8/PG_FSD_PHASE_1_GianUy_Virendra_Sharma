package strings;

public class Strings {

	public static void main(String[] args) {
		String o = "Mumbai";
		String l = new String("delhi");
		String y = new String("Mumbai");
		String p = new String("Hello");
		String t = "Delhi";
		String k = "delhi";
		
		if (o.equals(l)) {
			System.out.println("The sentence o equals l is: True");
		}		else {
			System.out.println("The sentence o equals l is: false");
		}
		if (y.equals(p)) {
			System.out.println("The sentence y equals p is: True ");
		}		else {
			System.out.println("The sentence y equals p is: false");
		}
		if (t.equals(o)) {
			System.out.println("The sentence t equals o is: True ");
		}		else {
			System.out.println("The sentence t equals o is: false");
		}
		if (k.equals(y)) {
			System.out.println("The sentence k equals y is: True ");
		}		else {
			System.out.println("The sentence k equals y is: false");
		}
		if (p.equals(y)) {
			System.out.println("The sentence p equals y is: True ");
		}		else {
			System.out.println("The sentence p equals y is: false");
		}
	}
}
