//Design a method to add an array inside another array of specified index ??
package akashSirPro;

import java.util.Scanner;

public class AddOneArrayToAnotherArray {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Provide  1st Array Size:-");
			int size1=s.nextInt();
			int []a=new int[size1];
			System.out.println("Enter Elements into Arrays");
			for (int i = 0; i < a.length; i++) {
				a[i]=s.nextInt();
			}
			System.out.println("Provide 2nd Array size");
			int size2=s.nextInt();
			int[] b=new int[size2];
			System.out.println("provide 2nd array element ");
			for (int i = 0; i < b.length; i++) {
				b[i]=s.nextInt();	
			}
			System.out.println("Enter the index of first array where you want to insert 2nd array:=");
			int index=s.nextInt();
			int[] res=insert(a,b,index);
			System.out.println("resultant array:=");
			for (int i = 0; i < res.length; i++) {
				System.out.println(res[i]);

			}
		}
	}
	public static int[] insert(int[] x,int[] y,int index)
	{
		if(index<0 || index>=x.length)
		{
			System.out.println("AIOOBE");
			return x;
		}
		int[] z=new int[x.length+y.length];
		for (int i = index,m=0; i < index+y.length; i++,m++) {
			z[i]=y[m];	
		}
		for (int i = 0; i < x.length; i++) {
			if(i<index)
			{
				z[i]=x[i];
			}
			else
			{
				z[i+y.length]=x[i];
			}
		}
		return z;
	}
}

