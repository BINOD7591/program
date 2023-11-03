//wap to find frequency of character in given string
package akashSirString;

import java.util.Scanner;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String s1=s.next();
		int[] count=new int[128];
		for (int i = 0; i < s1.length(); i++) {
			char ch=s1.charAt(i);
			count[ch]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i]!=0) {
				System.out.println((char)i+"----------->"+count[i]);
			}
		}
	}
}
