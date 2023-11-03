// Wap to print the elements which is palindrome number in an given array ?
package arrays;

public class A18 {

	public static void main(String[] args) {
		int[] a= {121,123,345,100,151};
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			int rev=0;
			while(a[i]>0)
			{
				rev=rev*10+a[i]%10;
				a[i]=a[i]/10;
			}
			if(temp==rev)
			{
				System.out.println(temp);
			}
		}

	}

}
