package akashSirPro;

import java.util.Scanner;

public class AddElementToArray {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Provide Array Size:-");
			int size=s.nextInt();
			int []a=new int[size];
			System.out.println("Enter Elements into Arrays");
			for (int i = 0; i < a.length; i++) {
				a[i]=s.nextInt();
			}
			System.out.println("enter the element what you want to insert into array:=");
			int element=s.nextInt();
			System.out.println("enter the index where you want to enter the element:=");
			int index=s.nextInt();
			int[] b=insert(a,element,index);
			System.out.println("resultant array:=");
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
		}
	}
	public static int[] insert(int[] x,int element,int index)
	{
		if(index<0 || index>=x.length)
		{
			System.out.println("IOOBE");
			return x;
		}
		int[] y=new int[x.length+1];
		y[index]=element;
		for (int i = 0; i < x.length; i++) {
			if(i<index)
			{
				y[i]=x[i];
			}
			else
			{
				y[i+1]=x[i];
			}

		}
		return y;
	}
}
