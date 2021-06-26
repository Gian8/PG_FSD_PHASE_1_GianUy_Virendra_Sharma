package arrays_exercises;

public class LargestElement {

	public static void main(String[] args) {
		
		int[] g = {1, 2, 6, 4, 5, 3};
		
		int max = g[0];
		for(int i = 1; i < g.length; i++)
		{
			if(g[i] > max)
			{
				max = g[i];
			}
		}
		System.out.println("Max is " + max);
	}
}
