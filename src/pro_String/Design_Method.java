//Design a Method to add n number ?
package pro_String;

public class Design_Method {

	public static void main(String[] args) {
		System.out.println(add(10,20,30,40,50));

	}
	public static int add(int ...a) {
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
		
	}

}
