package strings;

public class BufferBuilder {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Gian"); //Thread-safe
		sb.append(" Uy");
		System.out.println(sb);
		
		sb.insert(1, "false");
		System.out.println(sb);
		
		sb.replace(1, 3, "null");
		System.out.println(sb);
		
		sb.delete(1, 3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.charAt(3));
		
		StringBuilder ss = new StringBuilder("Simp lilearn");
		System.out.println(">>>>>>>" + ss);
		
		ss.append("L OVE ");
		System.out.println(">>>>>>>" + ss);
		System.out.println(ss.length() + " <-- this counts spaces in the strings too");
		System.out.println(ss.charAt(6) + " <-- this starts S at index 0");
		System.out.println(ss.reverse());
	}
}
