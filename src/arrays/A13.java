// Wap to find sum of array elements present at odd index?
package arrays;

public class A13 {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)                   //i&2==1
			{
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}

}
