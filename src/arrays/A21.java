/*
 1
 4  9
 16 25 36
 */
package arrays;

public class A21 {

	public static void main(String[] args) {
		int n=3;
		int a=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(a*a+" ");
					a++;
				}
				/*
				else
				{
					System.out.print("  ");
				}
				*/
			}
			System.out.println();
		}

	}

}
