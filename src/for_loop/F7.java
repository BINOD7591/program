package for_loop;

public class F7 {

	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 && i!=0 || i==j-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int j=1;j<n;j++)
			{
				if(j==n-1 && i!=0 || i+j==2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int j=1;j<n;j++)
			{
				if(i+j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
