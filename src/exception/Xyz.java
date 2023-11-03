package exception;

public class Xyz {
	public static void main(String[] args) throws Exception {
		int a=10;
		int b=20;
		if(a>b)
		{
			System.out.println(a+b);
		}
		else
		{
			throw new Exception("b is larger");
		}
	}

}
