package Collection.pack;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionsAssignment 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		
		lhs.add(22);
		lhs.add(5);
		lhs.add(8.8f);
		lhs.add(4.4f);
		lhs.add('A');
		lhs.add('B');
		lhs.add(true);
		System.out.print("Printout of first object of LinkedHashSet: ");
		System.out.println(lhs);
		System.out.println();
		
		System.out.println("Second object of LinkedHashSet:");
		
		LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.println("Enter 8 numbers here (press enter after each number): ");
		for (int i = 0; i < 8; i++) 
		{
			a = scan.nextInt();
					lhs2.add(a);
		}
		System.out.println("Printout of first object of LinkedHashSet: " + lhs2);

		TreeSet<Object> ts = new TreeSet<>();
		ts.add("JAVA");
		ts.add("PYTHON");
		ts.add("C#");
		ts.add("C++");
		ts.add("SWIFT");
		ts.add("PHP");
		System.out.println();
		System.out.print("TreeSet: ");
		System.out.println(ts);
		System.out.println();
		ts.remove("C++");
		ts.remove("PHP");
		System.out.print("TreeSet after removal: ");
		System.out.println(ts);
		System.out.println();
		ts.add("C");
		ts.add("RUBY");
		ts.add("PERL");
		System.out.print("TreeSet after addition: ");
		System.out.println(ts);
		
		System.out.println("Java is in the TreeSet: " + ts.contains("JAVA"));
		ts.removeAll(ts);
		System.out.println("TreeSet after removeAll: " + ts);
		
	}
}
