//Wap to reverse the word of a given string?
package pro_String;

import java.util.Scanner;

public class S8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:-");
		String s1=s.nextLine();
		String[] s2=s1.split(" ");
		String s3="";
		for(int i=s2.length-1;i>=0;i--)
		{
			s3+=s2[i]+" ";
		}
		System.out.print(s3);

	}

}
