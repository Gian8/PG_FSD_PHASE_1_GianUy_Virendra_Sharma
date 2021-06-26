package arrays_demo;

public class OneDimensionArrays {

	public static void main(String[] args) {
		
		double[] myList = {5.2, 5.6, 8.8, 2.5};
		
		for(int i = 0; i < myList.length; i++)
		{
			System.out.println(myList[i] + " " + i);
		}
		
		int[] ar = new int[4];
		int size = ar.length;
		System.out.println("Size of array is: " + size);
		
		//how to sum up elements
		double total = 0;
		
		for(int i = 0; i < myList.length; i++)
		{
			total += myList[i];
		}
		System.out.println("Total is " + total);
		
	}
}
