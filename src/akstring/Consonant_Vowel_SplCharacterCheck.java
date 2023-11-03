package akstring;

import java.util.Scanner;

public class Consonant_Vowel_SplCharacterCheck {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string value:-");
		String s1=s.next();
		for (int i = 0; i < s1.length(); i++) {
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				if(ch=='A' ||ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u')
				{
					System.out.println(ch+" is Vowel.");
				}
				else
				{
					System.out.println(ch+" is Consonant.");
				}
			}
			else
			{
				System.out.println(ch+" is Special Character.");
			}
		}
	}
}
