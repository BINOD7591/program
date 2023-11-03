// Wap to reverse an array elements without using an extra array ?
package arrays;

import java.util.Scanner;

public class A20
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Specify size of array:-");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the array elements:-");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0,j=a.length-1;i<a.length/2;i++,j--)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
