/* 

  *
 ***
*****
*******
*****
 ***
  *
  
  */

package akashSirPro;

public class Star {

	public static void main(String[] args) throws InterruptedException {

		int row = 7;
		int star = 1;
		int space = 3;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" " + "  ");
				Thread.sleep(500);

			}
			for (int k = 0; k < star; k++) {

				System.out.print("*" + "  ");
				Thread.sleep(500);

			}
			if (i < row / 2) {
				star += 2;
				space--;
			} else {
				star -= 2;
				space++;
			}
			System.out.println();
			Thread.sleep(500);

		}
	}

}
