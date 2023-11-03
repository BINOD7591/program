package akashSirString;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st String");
		String s1=s.nextLine();//mother in law And hitler Woman
		System.out.println("Enter 2nd String");
		String s2=s.nextLine();
		boolean res=isAnagram(s1,s2);
		if (res) {
			System.out.println(s1+" And "+s2+" Are Anagram.");
		}
		else
		{
			System.out.println(s1+" And "+s2+" Are Not Anagram.");
		}

	}
	public static int[] frequency(String s)
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
		return count;
	}
	public static boolean isAnagram(String s1,String s2)
	{
		int[] c1=frequency(s1);
		int[] c2=frequency(s2);
		for (int i = 0; i < c2.length; i++) {
			if (c1[i]!=c2[i]) {
				return false;
			}
		}
		return true;
	}
}
