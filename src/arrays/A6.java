//Wap to find Smallest element in a given array ?
package arrays;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		int[] a= {10,56,20,5,30,40,50};
		/*
		Scanner s=new Scanner(System.in);
		System.out.println("Specify size of array:-");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the array elements:-");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		*/
		int small=20;
		for(int i=0;i<a.length;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
		}
		System.out.println("smallest element is:- "+small);
	}
}