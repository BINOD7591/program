/*
 i/p               o/p
 AAABBCDDDD    A3B2C1D4
 */
package pro_String;

public class S13 {

	public static void main(String[] args) {
		String s="AAABBCDDDD";
		char[] ch=s.toCharArray(); 
		int count=0;
		int i;
		for(i=0;i<ch.length-1;i++)
		{
			if(ch[i]==ch[i+1])
			{
				count++;
			}
			else
			{
				count++;
				System.out.print(ch[i]);
				System.out.print(count);
				count=0;
			}
		}
		count++;
		System.out.print(ch[i]);
		System.out.print(count);
	}
}
