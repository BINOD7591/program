//
package pro_String;

public class S11 {

	public static void main(String[] args) {
		String s="MYSORE";
		char[] ch=s.toCharArray();
		int n=3;
		int index=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(ch[index]+" ");
					index++;
				}
			}
			System.out.println();
		}

	}

}
