//to count no of alphabet present in a given string?
package pro_String;

import java.util.Scanner;

public class S5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:-");
		String s1=s.nextLine();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>=65 && ch<=90 || ch>=97 && ch<=122 )
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
