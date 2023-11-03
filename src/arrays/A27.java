//To print table and get AVERAGE?
/*
 Team Points Captain
 RCB   12     VK
 CSK   14     MSD
 */
package arrays;

import java.util.Scanner;

public class A27 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  number of team");
		int row1=s.nextInt();
		int col= 3;
		String[][] a=new String[row1+1][col];
		a[0][0]="TEam";
		a[0][1]="Points";
		a[0][2]="Captain";
		System.out.println("Enter the team details:- ");
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=s.next();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
		for(int i=1;i<a.length;i++)
		{
			sum+=Integer.parseInt(a[i][1]);
		}
		int avg=sum/(a.length-1);
		String avg1=String.valueOf(avg);
		for(int i=1;i<a.length;i++)
		{
			if(a[i][1].equals(avg1));
			{
				System.out.println(a[i][0]);
			}
		}
		
	}

}
