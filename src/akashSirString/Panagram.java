package akashSirString;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st String");
		String s1=s.nextLine();
		boolean res=isPanagram(s1);
		if (res) {
			System.out.println(s1+" is Panagram.");
		}
		else
		{
			System.out.println(s1+" Are Not Anagram.");
		}

	}
	public static boolean isPanagram(String s)
	{
		int[] count=new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				count[ch-97]++;
			}
			else if(ch>='A' && ch<='Z')
			{
				count[ch-65]++;
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i]==0) {
				return false;
			}
		}
		return true;
	}
}
