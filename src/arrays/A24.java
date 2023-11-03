/*
i/p                           o/p
int[] a={2,4,5,7,9};         2,7,11,12
int[] b= {4,5,9,11,12};
*/
package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class A24 {
	public static void main(String[] args) {
		int[] a={2,4,5,7,9};
		int[] b= {4,5,9,11,12};
		ArrayList al=new ArrayList();
		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
			al.add(b[i]);
		}
		Collections.sort(al);
		for(int i=0;i<al.size();i++)
		{
			int count=0;
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)==al.get(j))
				{
					count++;
					al.remove(j);
					break;
				}
			}
			if(count==0)
			{
				System.out.println(al.get(i));
			}
		}
	}
}
