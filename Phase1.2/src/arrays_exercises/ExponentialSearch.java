package arrays_exercises;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String args[]) {
		int[] ar = {6, 12, 18, 24, 32};
		int length = (ar.length-1);
		int value = 188;
		int outcome = exponentialSearch(ar, length, value);
		
		if(outcome < 0) {
			System.out.println("Element is not present in the array");
		}else {
			System.out.println("Element is present in the array at index: " + outcome);
		}
	}
	
	public static int exponentialSearch(int[] ar, int length, int value) {
		if(ar[0] == value) {
			return 0;
		}
		int i = 1;
		while(i < length && ar[i] <= value) {
			i = i * 2;
		}
		return Arrays.binarySearch(ar,  i/2, Math.min(i, length), value);
	}
}
