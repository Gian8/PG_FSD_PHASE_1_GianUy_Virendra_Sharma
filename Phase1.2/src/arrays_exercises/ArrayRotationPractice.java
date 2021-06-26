package arrays_exercises;

import java.util.Arrays;

public class ArrayRotationPractice {

	public static void main(String args[]) {
		int[] array = {41, 22, 03, 44, 15, 66, 17}; //define the array
		int n = 3; //define the rotation amount
		System.out.println("Original array: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		//	Arrays.sort(array);
		//	System.out.println(array);
		}
		System.out.println();
		Arrays.sort(array);
		System.out.println("Sorted array: ");
		for(int i = 0; i < array.length; i++) {
		System.out.print(array[i] + " ");
		}
		//ROTATION ALGORITHM - shift to right n times
	/*	for(int i = 0; i < n; i++) {//starts from index 0 and repeats loop as long as index is less than n and will continue in a positive direction
			int y, lastElement; //define variables
			lastElement = array[array.length - 1];//store the last element of array
			for(y = array.length - 1; y > 0; y--) {//start from last element and repeats loop as long as index is > index 0 and will continue in a negative direction
				array[y] = array[y - 1];//shift elements of array by one to right
			}
				array[0] = lastElement;//this will add last element to start of array
		}
		System.out.println();*/
		
		//ROTATION ALGORITHM - shift to left n times
		for(int i = 0; i < n; i++) {
			int z, firstElement;
			firstElement = array[0];
			for(z = 0; z < array.length -1; z++) {
				array[z] = array[z+1];
			}			
			array[z] = firstElement;
		}
		System.out.println();
			System.out.println("Array after right rotation: ");
			for(int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");			
		}
	}
}
