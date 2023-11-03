//
package pro_String;

import java.util.Scanner;

public class S9 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:-");
		String s1=s.nextLine();
		String[] s2=s1.split(" ");
		String s3="";
//		for(int i=0;i<s2.length;i++)
//		{
//			s3+=reverse(s2[i])+" ";
//		}
		for(int i=s2.length-1;i>=0;i--)
		{
			s3+=reverse(s2[i])+" ";
		}
		System.out.print(s3);
	}
	public static String reverse(String s) {
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		return s1;
	}

}
