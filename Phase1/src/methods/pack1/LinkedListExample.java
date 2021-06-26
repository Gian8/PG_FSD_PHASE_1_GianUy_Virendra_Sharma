package methods.pack1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main (String[] args) {
	LinkedList<String> ll = new LinkedList <String>();
	
	ll.add("January");
	ll.add("February");
	ll.add("March");
	ll.add("April");
	
	Iterator<String> i = ll.iterator();
	while (i.hasNext()) {
		System.out.println("Month of " + i.next());
	}
	System.out.println("Size of list " + ll.size());
	System.out.println("----------------------------------------");
	ll.add("September");
	ll.add("October");	
	Iterator<String> i2 = ll.iterator();
	while (i2.hasNext()) {
		System.out.println("Month of " + i2.next());
	}
	System.out.println("Size of list " + ll.size());
	System.out.println("----------------------------------------");
	ll.add("May");
	ll.add("June");
	ll.add("July");
	ll.add("August");
	Iterator<String> i3 = ll.iterator();
	while (i3.hasNext()) {
		System.out.println("Month of " + i3.next());
	}
	System.out.println("Size of list " + ll.size());
	System.out.println("----------------------------------------");
	ll.addLast("November");
	ll.addLast("December");
	
	Iterator<String> i4 = ll.iterator();
	while (i4.hasNext()) {
		System.out.println("Month of " + i4.next());
	}

	System.out.println(ll);
	ll.remove(4);
	System.out.println(ll);
	ll.remove(4);
	System.out.println(ll);
	ll.add(8, "September");
	System.out.println(ll);
	ll.add(9, "October");
	System.out.println(ll);
	
	Iterator<String> i5 = ll.iterator();
	while(i5.hasNext()) {
		System.out.println("Month of " + i5.next());
	}
	System.out.println("Size of list " + ll.size());
	System.out.println("----------------------------------------");
	
	//vector is done the same way, only difference is vector works on multithreading
	}
}
