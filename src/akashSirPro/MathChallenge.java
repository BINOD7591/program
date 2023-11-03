package akashSirPro;

import java.util.Scanner;

public class MathChallenge {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println(findLargestDoubleDigit(s.nextInt()));

	}

	public static int findLargestDoubleDigit(int num) {

		int largestDoubleDigit = -1;
		String numStr = String.valueOf(num);
		for (int i = 0; i < numStr.length() - 1; i++) {
			String twoDigitsStr = numStr.substring(i, i + 2);
			int twoDigits = Integer.parseInt(twoDigitsStr);
			if (twoDigits > largestDoubleDigit) {
				largestDoubleDigit = twoDigits;
			}
		}
		return largestDoubleDigit;
	}
}
