// Wap to print the elements which are present at even index?
package arrays;

public class A7 {

	public static void main(String[] args)
	{
		int[] a= {10,20,30,40,50};
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(a[i]);
			}
		}	
	}
}
