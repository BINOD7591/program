// Wap to find sum of array elements if the elements is odd?
package arrays;

public class A15 {

	public static void main(String[] args) {
		int[] a= {10,20,23,25,50};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}

}
