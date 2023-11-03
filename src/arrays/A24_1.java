/*
i/p                           o/p
int[] a={2,4,5,7,9};         2,7,11,12
int[] b= {4,5,9,11,12};
*/
package arrays;

public class A24_1 {

	public static void main(String[] args) {
		int[] a={2,4,5,7,9};
		int[] b= {4,5,9,11,12};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					count++;
				} 
			}
			if(count==0)
			{
				System.out.println(a[i]);
			}
		}
		for(int i=0;i<b.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					count++;
				} 
			}
			if(count==0)
			{
				System.out.println(b[i]);
			}
		}
		

	}
}