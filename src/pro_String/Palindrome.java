//Wap to check the given String is Palindrome or not?
package pro_String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:-");
		String s1=s.nextLine();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			s2=s1.charAt(i)+s2;
		}
		if(s2.equals(s1))
		{
			System.out.println("Is palindrome");
		}
		else
		{
			System.out.println("is not palindrome");
		}

	}

}
