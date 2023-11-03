// Wap to store prime number and Palindrome number between 1 to 100 and remove duplicate vallues?
package pro_String;

import java.util.TreeSet;

public class S18 {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		for(int x=1;x<=100;x++)
		{
			int n=x;
			int b=2;
			int count=0;
			while(b<n)
			{
				if(n%b==0)
				{
					count++;
					break;
				}
				b++;
			}
			if(count==0)
			{
				ts.add(n);
			}
			int temp=n;
			int rev=0;
			while(temp>0)
			{
				rev=rev*10+temp%10;
				temp=temp/10;
			}
			if(rev==n)
			{
				ts.add(n);
			}
		}
		System.out.println(ts);
	}

}
