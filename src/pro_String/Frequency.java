/*
 i/p          o/p
 KARNATAKA    A4K2N1R1T1
 */
package pro_String;

public class Frequency {

	public static void main(String[] args) {
		String s="JAVA";
		char[] ch=s.toCharArray();
		for(int i=1;i<ch.length;i++)
		{
			for(int j=0;j<ch.length-i;j++)
			{
				if(ch[j]>ch[j+1])
				{
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
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
				System.out.println(ch[i]+"----->"+count);
				count=0;
			}
		}
		count++;
		System.out.println(ch[i]+"----->"+count);
	}

}
