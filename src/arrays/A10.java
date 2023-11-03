// Wap to print the elements of an array if the element is odd number ?
package arrays;

public class A10 {

	public static void main(String[] args)
	{
		int[] a= {10,20,30,67,99,31,40,50};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}	
	}
}