//Wap to count the no of wards present in a given string?
package pro_String;

import java.util.Scanner;

public class S4 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
	    System.out.println("enter string:-");
	    String s1=s.nextLine();
		String[] s2=s1.split(" ");
		System.out.println(s2.length);
	}

}
