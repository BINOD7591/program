/*
    i/p    o/p
    ---   ---
     1     1
     2     13
     3     135
     4     1357
     5     13579
 */
package arrays;

import java.util.Scanner;

public class IVQ1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("input:- ");
		int n=s.nextInt();
		int count=0;
		int a=1;
		while(count<n)
		{
			if(a%2!=0)
			{
				System.out.println(a);
				count++;
			}
			a++;
		}
	}
}