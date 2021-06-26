package assignments.pack;

import java.util.Iterator;
import java.util.LinkedList;

public class MonthIterationAssignment {

	public static void main(String[] args) {
		
		LinkedList<String> lL = new LinkedList<>();
		lL.add("February");
		lL.add("March");
		lL.add("April");
		lL.addFirst("January");
		System.out.println("Size of list: " + lL.size());
		System.out.println("Elements inside list: " + lL);
		Iterator<String> i = lL.iterator();
		while(i.hasNext()) {
			System.out.println("Month of " + i.next());
		}
		lL.add("September");
		lL.add("October");
		System.out.println("Size of list: " + lL.size());
		System.out.println("Elements inside list: " + lL);
		Iterator<String> i2 = lL.iterator();
		while(i2.hasNext()) {
			System.out.println("Month of " + i2.next());
		}
		lL.add("May");
		lL.add("June");
		lL.add("July");
		lL.add("August");
		System.out.println("Size of list: " + lL.size());
		System.out.println("Elements inside list: " + lL);
		Iterator<String> i3 = lL.iterator();
		while(i3.hasNext()) {
			System.out.println("Month of " + i3.next());
		}
		//lL.addLast("November");
		//lL.addLast("December");
		//System.out.println("Size of list: " + lL.size());
		//System.out.println("elements inside list: " + lL);
		//Iterator<String> i4 = lL.iterator();
		//while(i4.hasNext()) {
		//	System.out.println("Month of " + i4.next());
		//}
		
		LinkedList<String> lL2 = new LinkedList<>();
		lL2.addLast("December");
		lL2.addFirst("November");
		System.out.println("Size of new list: " + lL2.size());
		System.out.println("Elements in new list: " + lL2);
		Iterator<String> i4B = lL2.iterator();
		while(i4B.hasNext()) {
			System.out.println("Month of " + i4B.next());
		}
		lL.addAll(lL2);
		System.out.println("Elements of combined list: " + lL);
		lL.remove(4);
		System.out.println(lL);
		lL.remove(4);
		System.out.println(lL);
		lL.add(8, "September");
		System.out.println(lL);
		lL.add(9, "October");
		System.out.println(lL);
		Iterator<String> i5 = lL.iterator();
		while(i5.hasNext()) {
			System.out.println("Month of " + i5.next());
		}
		
	}
}
