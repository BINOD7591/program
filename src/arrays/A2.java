
//Wap to read n elements from an array and check wheather key elements present in that in the array or not ?

package arrays;

import java.util.Scanner;

public class A2 {

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
		System.out.println("Enter key elements:-");
		int key=s.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("Key is found");
		}
		else
		{
			System.out.println("Key is not found");
		}
	}
}
