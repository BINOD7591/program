//wap to find frequency of alphabet ignoring case.
package akashSirString;

import java.util.Scanner;

public class FrequencyOfAlphabet {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String s1=s.next();
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
			if (count[i]!=0) {
				System.out.println((char)(i+65)+"----------->"+count[i]);
			}
		}
	}
}
