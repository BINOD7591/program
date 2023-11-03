package akashSirPro;

public class NthSmallestNumber {

	public static void main(String[] args) {
		int[] a= {4,7,9,15,3,68,8,100,200,132,65,199,6,12,657};
		int n=5;
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j=0; j<a.length; j++) {
				if(a[i]<a[j])
				{
					count++; 
				}
			}
			if(count==(a.length-n))
			{
				System.out.println(n+"th smallest number is:= "+a[i]);
			}
		}
	}
}
