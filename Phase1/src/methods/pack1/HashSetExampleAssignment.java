package methods.pack1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class HashSetExampleAssignment {

	public static void main (String[] args) {
		TreeSet<String> ts = new TreeSet<>(); //output order is sorted
		ts.add("bread");
		ts.add("Iron Boots");
		ts.add("Steel Sword");
		ts.add("Health Potion");
		ts.add("Mage Book");
		ts.add("Crystal Shield");
		
		System.out.println(ts);
			
		LinkedHashSet<Object> lh = new LinkedHashSet<>(); //output order is insertion order
		lh.add("Goblin");
		lh.add("Elf");
		lh.add(44);
		lh.add(44);
		lh.add('G');
		lh.add(23.11f);
		
		System.out.println(lh);
		
		HashSet<Object> hs = new HashSet<>(); //output order is random
		hs.add("Goblin");
		hs.add("Elf");
		hs.add("Elf");
		hs.add("String");
		hs.add("String4");
		hs.add("String8");
		System.out.println("Before addAll code: " + hs);
		hs.addAll(lh);
		System.out.println("After addAll code: " + hs);
		System.out.println("Size of HashSet is = " + hs.size());
		System.out.println("Does HashSet contain '45' element? " + hs.contains(45));
		System.out.println( "Is HashSet empty? " + hs.isEmpty());
		System.out.println("Remove the element: " + hs.remove("Elf"));
		System.out.println("New HashSet is: " + hs);
		//hs.clear();
		System.out.println("HashSet after clear: " + hs);
		System.out.println("Class of HashSet is: " + hs.getClass());
		System.out.println( "Is HashSet empty after clear? " + hs.isEmpty());
		
		//List<Object> lL = new LinkedList<Object>(hs);
		//System.out.println("Printing as LinkedList: " + lL);
		//Iterator<Object> i = lL.iterator();
		//while(i.hasNext()) {
		//	System.out.println("Element is: " + i.next());
		//}
		
		//for(Object hashset : hs) {
		//	System.out.println("for loop printing: " + hashset);
		//}
		
		hs.forEach(System.out::println);
	
	}
	

}
