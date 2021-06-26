package arrays_demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayTest {

	public static void main(String[] args) {
		/* examples of how to make an array
		 * String arr[] = new String[40]; (where 40 is the amount of elements inside array)
		 * int arr[] = {1,53,646,34,26,77}; <--- arr.length will give 6
		 * in 2D array (int s[][] = new int[3][3]), the 1st number refers to row, 2nd to column
		 * int s[][] = {{1, 2}, {3, 4}}; <-- first bracket pair is 1st row (top to bottom)
		 * and second bracket pair is 2nd row WHEN DRAWN
		 */
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial size of ArrayList: " + al.size());
		al.add("Playstation");
		al.add("Xbox");
		System.out.println("ArrayList: " + al);
		System.out.println("Size of new Array: " + al.size());
		al.add(1, "Nintendo64");
		System.out.println("Arraylist after addition on index 1: " + al);
		System.out.println("Size of array after addition: " + al.size());
		System.out.println("element in position 2: " + al.get(2));
		Collections.reverse(al);
		System.out.println("Reversed order of array: " + al);
		al.set(2, "GameboyAdvanced");
		System.out.println("Array after set code: " + al);
		al.remove(2);
		System.out.println("Array after remove code " + al);
		System.out.println(al.getClass());
		System.out.println(al.isEmpty());
		System.out.println(al.contains("xbox"));
		System.out.println(al.contains("Xbox"));
		System.out.println(al.indexOf("Nintendo64"));
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Wolverine");
		al2.add("Jean Grey");
		al2.add("Magneto");
		
		al.addAll(al2);
		System.out.println(al);
		System.out.println(al.indexOf("Wolverine"));
//		int [][] arr = {{8,9},{5,17}};
//		for (int i = 0; i<2; i++) {
//			for (int j = 0; j<2; j++) {
//				System.out.println(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}