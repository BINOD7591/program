package for_loop;

public class F6 {

	public static void main(String[] args) {
		int n=7;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 && j!=0 && j!=n-1 || i==n-1 && j!=0 && j!=n-1 || j==0 && i!=0 && i!=n-1 || j==n-1 && i!=0 && i!=n-1 || 
						i==2 && j==2 || i==2 && j==4 || i==4 && j!=1 && j!=5)
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