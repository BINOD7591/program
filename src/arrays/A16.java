// Wap to find the sum of array elements if the elements is divisible by 3 ?
package arrays;

public class A16 {

	public static void main(String[] args) {
		int[] a= {10,20,23,15,18,25,50};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%3==0)
			{
				sum+=a[i];			
			}
		}
			System.out.println(sum);	
	}
}
