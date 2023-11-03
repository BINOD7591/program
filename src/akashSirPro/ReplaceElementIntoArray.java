package akashSirPro;

import java.util.Scanner;

public class ReplaceElementIntoArray {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Provide Array Size:-");
			int size=s.nextInt();
			int []a=new int[size];
			System.out.println("Enter Elements into Arrays");
			for (int i = 0; i < a.length; i++) {
				a[i]=s.nextInt();
			}
			System.out.println("enter the index where you want to replace the element:=");
			int index=s.nextInt();
			System.out.println("enter the new element:=");
			int element=s.nextInt();
			int[] b=replace(a,element,index);
			System.out.println("resultant array:=");
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);	
			}
		}
	}
	public static int[] replace(int []x,int element,int index)
	{
		if(index<0 || index>=x.length)
		{
			System.out.println("IOOBE");
			return x;
		}
		else
		{
			for (int i = 0; i < x.length; i++) {
				if(i==index)
				{
					x[i]=element;
				}
			}
			return x;
		}
	}

}
