package arrays_demo;

public class TwoDimensionArrays {
	
	public static void main(String[] args) {
		
		int [][] ar = {{1, 2}, {3, 4}};
		
		for(int i = 0; i < 2; i++)
		{
			for(int o = 0; i < 2; i++)
			{
				System.out.println(ar[i][o] + " ");
			}
			System.out.println();
		}
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
		
		int[][] x = {{1, 2}, {3, 4}};
		int[][] y = {{5, 6}, {7, 8}};
		
		int row = 2;
		int col = 2;
		int [][] sum = new int[row][col];
		for(int ii = 0; ii < row; ii++)
		{
			for(int oo = 0; oo < col; oo++)
			{
				sum[ii][oo] = x[ii][oo] + y[ii][oo];
				System.out.println(sum[ii][oo] + " ");
			}
			System.out.println();
		}
		
		System.out.println("_____________________________");
		int[][] a1 = {{55, 7, 66}, {88, 99, 22}};
		int[][] a2 = {{8, 69, 99}, {56, 56, 36}};

		int rows = 2;
		int columns = 3;
		int[][] sum2 = new int[rows][columns];

		for(int i3 = 0; i3 < rows; i3++)
		{
			for(int o3 = 0; o3 < columns; o3++)
			{
				sum2[i3][o3] = a1[i3][o3] + a2[i3][o3];
				System.out.println("sums of both arrays are: " + sum2[i3][o3]);
			}
		}
		
		for(int i2 = 0; i2 < rows; i2++)
		{
			for(int o2 = 0; o2 < columns; o2++)
			{
				System.out.println(sum2[i2][o2] + "  ");
			}
			System.out.println();
		}
	}

}
