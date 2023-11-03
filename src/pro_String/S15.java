/*
 i/p    o/p
 XTD     EUY
 ABDEF   GFECB
 */
package pro_String;

public class S15 {

	public static void main(String[] args) {
		String s1="ABDEF";
		String s2="";
		for(int i=0,j=s1.length()-1;i<s1.length();i++,j--)//i=s.length()-1;i>=0;i--
		{
			char ch=s1.charAt(j);
			ch++;
			s2+=ch;
		}
		System.out.println(s2);

	}

}
