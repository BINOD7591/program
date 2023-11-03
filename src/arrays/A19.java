
//Wap to print an array in reverse order?

package arrays;

import java.util.Scanner;

public class A19 {

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
		int[] b=new int[a.length];
		for(int i=0,x=1;i<a.length;i++,x++)
		{
			b[b.length-x]=a[i];
		}
		System.out.println("In reverse order:-");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}