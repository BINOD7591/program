//Wap to design a 2D array by taking input from user?
package arrays;

import java.util.Scanner;

public class A25 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of row");
		int row=s.nextInt();
		System.out.println("Enter the size of column");
		int col=s.nextInt();
		int[][] a=new int[row][col];
		System.out.println("Enter the elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Entered elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
