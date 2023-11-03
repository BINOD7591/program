// wap to read n elements from the user and print all the elements ?
package arrays;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Specify size of array:-");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the array elements:-");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Entered Elements are:-");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}