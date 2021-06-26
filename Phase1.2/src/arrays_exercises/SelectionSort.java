package arrays_exercises;

public class SelectionSort {

	public static void main(String[] args) {
		int []arr = {29, 72, 98, 13, 87, 66, 52, 55, 36};
		selectionSort(arr);
		System.out.println("The sorted elements are: ");
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int index = i;
			for(int j = i + 1; j < arr.length; j++) {//iterating through the loop and comparing values
				if(arr[j] < arr[index]) {//checking the value of the index with every element
					index = j;//set the smallest element
				}
			}
			int smallNumber = arr[index];//swapping of elements when the smallest is found
			arr[index] = arr[i];
			arr[i] = smallNumber;
		}
	}
}
