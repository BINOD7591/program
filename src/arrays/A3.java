
//Wap to find largest element in a given array ?

package arrays;

import java.util.Scanner;

public class A3 {

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
		int large=0;
		for(int i=0;i<a.length;i++)
		{
			if(large<a[i])
			{
				large=a[i];
			}
		}
		System.out.println("largest element is:- "+large);
	}
}
