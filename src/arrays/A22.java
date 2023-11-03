//Wap to create an integer array of size n by reading n elements from the user and initialize the value by read from user and print the prod of 1st and last element?
package arrays;

import java.util.Scanner;

public class A22 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println(a[0]*a[a.length-1]);

	}

}
