package assignment;

import java.util.Scanner;

public class DuplicateRemove {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String s1=s.next();
		String result="";
		int[] count=new int[26];
		for (int i = 0; i < s1.length(); i++) {
			char ch=s1.charAt(i);
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
			if (count[i]==1) {
				result+=(char)(i+97);
			}
		}
		System.out.println(result);
	}
}
