package for_loop;

public class F4 {

	public static void main(String[] args) {
		int n=7;
		int star=1;
		int space=3;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<star;j++)
			{
				System.out.print("* ");
			}
			if(i<n/2)
			{
			space--;
			star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
			System.out.println();
		}

	}

}
