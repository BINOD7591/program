//Wap to check wheather given string is symetric or not?
/*
 i/p
 madam,ammamma,maddam.
 */
package pro_String;

public class S12 {

	public static void main(String[] args) {
		String s="MADAM";
		char[] ch=s.toCharArray();
		int a=ch.length/2;
		int count=0;
		int i=a,j=a;
		if(ch.length%2==0)
		{
			i--;
		}
		for(;i>=0;i--,j++)//j<ch.length malayalam
		{
			if(ch[i]!=ch[j])
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(s+" is symmetry");
		}
		else
		{
			System.out.println(s+" is not Symmetry");
		}
	}
}
