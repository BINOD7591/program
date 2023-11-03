package akashSirPro;

public class Prime {

	public static void main(String[] args) {
		int n = 0;
		for (int i = 2; i < 100; i++) {

			int a = i;
			int b = 2;
			int count = 0;

			while (b < a) {
				if (a % b == 0) {
					count++;
					break;
				}
				b++;
			}
			if (count == 0) {
				System.out.println(a + " is prime");
				n++;
			}
		}
		System.out.println("Total no of prime is: "+n);

	}

}
