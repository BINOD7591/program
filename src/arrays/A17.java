//Wap to print number of even numbers and no of odd number present in an array?
package arrays;

public class A17 {

	public static void main(String[] args) {
		int[] a= {12,13,14,15,16,17};
		int count1=0;
		int count2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count1++;
			}
			else
			{
				count2++;
			}
		}
		System.out.println("Number of even elements is:- "+count1);
		System.out.println("Number of odd elements is:- "+count2);
	}

}
