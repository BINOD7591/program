package pro_String;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:-");
		String s1=s.nextLine();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			s2=s1.charAt(i)+s2;
		}
		System.out.println(s2);
	}

}
