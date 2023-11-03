package akashSirPro;

import java.util.Scanner;

public class DeleleElementFromArray {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Provide Array Size:-");
			int size=s.nextInt();
			int []a=new int[size];
			System.out.println("Enter Elements into Arrays");
			for (int i = 0; i < a.length; i++) {
				a[i]=s.nextInt();
			}
			System.out.println("Enter the index where you want to delete the element:=");
			int index=s.nextInt();
			int[] res=delete(a,index);
			System.out.println("resultant array:=");
			for (int i = 0; i < res.length; i++) {
				System.out.println(res[i]);
			}
		}
	}
	public static int[] delete(int[] x,int index)
	{
		if(index<0 || index>=x.length)
		{
			System.out.println("IOOBE");
			return x;
		}
		int[] y=new int[x.length-1];
		for (int i = 0; i < x.length-1; i++) { //i<y.length
			if(i<index)
			{
				y[i]=x[i];
			}
			else
			{
				y[i]=x[i+1];
			}
		}
		return y;
	}
}
