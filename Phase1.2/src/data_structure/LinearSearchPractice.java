package data_structure;

import java.util.Scanner;

public class LinearSearchPractice 
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		int search = s.nextInt();
		int result = linearSearch(arr, search);
		if (result == -1)
		{
			System.out.println("Element is not in the array");
		}
		else
		{
			System.out.println("Element " + search + " is found at index " + result);
		}
		s.close();
	}
	
	public static int linearSearch(int arr[], int x) 
	{
		for (int i = 0; i < arr.length -1; i++) //loop array to identify each element to compare with int x
		{
			if (arr[i] == x) //if element in array matches x, that element will be returned <---
			{//										         								   |
				return i;//      <--------------------------------------------------------------
			}
		}
		return -1;//otherwise return -1 which will be used to declare invalid/out-of-bound array element
	}
}
