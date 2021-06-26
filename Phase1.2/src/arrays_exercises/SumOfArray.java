package arrays_exercises;

import java.util.Arrays;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int[] g = {55, 6, 3456, 23, 2, 76, 3};
		System.out.println(Arrays.toString(g));
		
		//for loop
		int i, x;
		for(i = 0; i < g.length; i++) 
		{
			x = g[i];
			System.out.println(x + " ");
		}
		System.out.println("_____________________________");
		
		//for each loop
		int y;
		for(int i2 : g)
		{
			y = i2;
			System.out.println(y + " ");			
		}
		
		int total = 0;
		for(int i3 = 0; i3 < g.length; i3++)
		{
			total += g[i3];
			System.out.println(i3 + " " + g[i3]);
		}
	}

}
