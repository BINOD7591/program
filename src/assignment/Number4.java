package assignment;

import java.util.Scanner;

public class Number4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char[] ch= {'A','B','C','O','D','E','A','O','B','D','E','A','O','E','D',
				    'B','A','B','E','D','O','D','A','O','O','D','E','O','A','E'};
		System.out.println("ENTER THE STUDENT NUMBER");
		int number=s.nextInt();
		if (number<=30) {
			for (int i = 0; i < ch.length; i++) {
				if (i+1==number) {
					System.out.println("Student test score is:- "+ch[i]);
				}
			}
		}
	}
}
