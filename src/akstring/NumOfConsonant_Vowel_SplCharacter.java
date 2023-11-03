package akstring;

import java.util.Scanner;

public class NumOfConsonant_Vowel_SplCharacter {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string value:-");
		String s1=s.next();
		int[] a=numOf(s1);
		System.out.println("number of vowel is "+a[0]);
		System.out.println("number of consonant is "+a[1]);
		System.out.println("number of digit is "+a[2]);
		System.out.println("number of splcharacter is "+a[3]);
		
	}
	public static int[] numOf(String s1)
	{
		int vowel=0,consonant=0,digit=0,splcha=0;
		for (int i = 0; i < s1.length(); i++) {
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				if(ch=='A' ||ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u')
				{
					vowel++;
				}
				else
				{
					consonant++;
				}
			}
			else if(ch>='0' && ch<='9')
			{
				digit++;
			}
			else
			{
				splcha++;
			}
		}
		int[] b= {vowel,consonant,digit,splcha};
		return b;
	}
}
