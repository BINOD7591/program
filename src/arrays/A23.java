//Wap to print duplicate elements in an array ?
package arrays;

public class A23 {

	public static void main(String[] args) {
		int[] a= {10,34,30,10,67,34};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			   if(a[i]==a[j])
			   {
				  System.out.println(a[j]);
			   }
			}
		}

	}
}
