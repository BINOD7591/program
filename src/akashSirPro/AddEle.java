package akashSirPro;

public class AddEle {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8 };
		int[] c = new int[a.length + b.length];
		int index = 2;
		if (index < 0 || index>=a.length) {
			System.out.println("AIOOBE");

		} else {
			for (int i = 0; i < a.length; i++) {
				if (i < index) {
					c[i] = a[i];
				} else {
					c[i + b.length] = a[i];
				}
			}
			for (int i = index, x = 0; i < index + b.length; i++, x++) {
				c[i] = b[x];

			}
			for (int i : c) {
				System.out.println(i);
			}
		}
	}
}
