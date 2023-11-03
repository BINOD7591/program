// Wap to add two matrix?

//condition row amd column of 2 matrix should be same to perform matrixaddition
package arrays;

import java.util.Scanner;

public class A26 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of 1st matrix row");
		int row1=s.nextInt();
		System.out.println("Enter the size of 1st matrix column");
		int col1=s.nextInt();
		int[][] a=new int[row1][col1];
		System.out.println("Enter the of elements of 1st matrix");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the size of 2st matrix row");
		int row2=s.nextInt();
		System.out.println("Enter the size of 2st matrix column");
		int col2=s.nextInt();
		int[][] b=new int[row2][col2];
		System.out.println("Enter the of elements of 2st matrix");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<col2;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		if(row1==row2 && col1==col2)
		{
			int[][] c=new int[row1][col1];
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col1;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			System.out.println("Resultant matrix is:- ");
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col1;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Addition not Possible");
		}
	}

}

