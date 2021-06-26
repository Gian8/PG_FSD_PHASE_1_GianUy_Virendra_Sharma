package arrays_exercises;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		//int ar[]= {20,12,12,33,4,66,4,4,44,4,25,7,20,1,20,44,3};
		int ar[]= {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		System.out.println(Arrays.toString(ar));
		
	//	Arrays.sort(ar);
	//	System.out.println("After sorting");
	//	System.out.println(Arrays.toString(ar));
		
	//	int ar2[]=Arrays.copyOf(ar, ar.length+3);
	//	System.out.println("ar2 : "+Arrays.toString(ar2));
		
		//For binarySearch make sure your array is sorted in ascending order only.
		//binarySearch method in Java will return positive value if the element is found else it will give negative value
	//	System.out.println("Arrays.binarySearch(ar, 800) : "+Arrays.binarySearch(ar, 800));
	//	System.out.println("Arrays.binarySearch(ar, 20) : "+Arrays.binarySearch(ar, 20));
	//	System.out.println("Arrays.binarySearch(ar, 8) : "+Arrays.binarySearch(ar, 8));
		System.out.println("Arrays.binarySearch(ar, 23) : "+Arrays.binarySearch(ar, 23));
	}
}
