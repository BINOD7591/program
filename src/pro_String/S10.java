//Wap to count no of Special characters in a given String?
//Wap to print no of vowels and consonant in a given String?
package pro_String;

public class S10 {

	public static void main(String[] args) {
		String s="Hello";
		int nv=0;
		int nc=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 && ch<=97 || ch>=97 && ch<=122)
			{
				if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u')
				{
					nv++;
				}
				else
				{
					nc++;
				}
			}
		}
		System.out.println("Nomber of vowel is:-"+nv);
		System.out.println("Number of consonent is:- "+nc);
	}
}
