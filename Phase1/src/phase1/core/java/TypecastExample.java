package phase1.core.java;

public class TypecastExample {

	public static void main(String[] args) {
		//typecasting between int and long
		int i = 36;
		long l = 888111222;
		System.out.println("long value " + l);
		int i2 = (int) l;
		System.out.println("Explicit int value " + i2);
		char c = (char) i;
		System.out.println("Explicit casting from int to char = " + c);
		
		float f = l;
		System.out.println("Implicit casting (automatic) from long to float = " + f);
		
		double d =  9870298452.13245;
		System.out.println("Double value is + " + d);
		long l2 = (long) d;
		System.out.println("Explicit casting from double to long = " + l2);
		
		byte b;
		int i3 = 257;
		b = (byte) i3;
		System.out.println(b);
		
		Integer iWrap = i2; // WRAPPER - integer primitive to integer object (auto boxing)
		System.out.println("Auto boxing: " + iWrap);
		int G = Integer.valueOf(iWrap); // WRAPPER - integer object to integer primitive (unboxing)
		System.out.println("Unboxing: " + G);
		int G1 = Integer.SIZE;
		System.out.println(G1);
		

	}

}
