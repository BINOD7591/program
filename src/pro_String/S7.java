//to find the sum of digit in a given String?
package pro_String;

import java.util.Scanner;

public class S7 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter string:-");
		String s=s1.nextLine();
		int sum=0;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				String s3=String.valueOf(ch);
				int a=Integer.parseInt(s3);
				sum+=a;
				
			}
		}
		System.out.println(sum);

	}

}
