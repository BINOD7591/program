package for_loop;

public class F2{

	public static void main(String[] args) {
		int n=4;
		int star=7;
		int space=0;
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
			space++;
			star-=2;
			System.out.println();
		}

	}

}
