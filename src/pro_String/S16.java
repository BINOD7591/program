//Wap to store the prime number from 1 to 100;
package pro_String;

import java.util.ArrayList;

public class S16 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		for(int x=2;x<=100;x++)
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
				al.add(n);
			}
			
		}
		System.out.println(al);
	}

}
