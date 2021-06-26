package arrays_demo;

public class TwoDimensionArrayAssignment {

	public static void main(String[] args) {
		
		int[][] a = {{7, 4}, {2, 9}};
		int[][] b = {{1, 5}, {3, 8}};
		int[][] c = new int[2][2];
		for(int i2 = 0; i2 < 2; i2++)
		{
			for(int o2 = 0; o2 < 2; o2++)
			{
				c[i2][o2] = a[i2][o2] + b[i2][o2];
				System.out.println(c[i2][o2] + " ");
			}
			System.out.println();
		}
	}
}
