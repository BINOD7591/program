package akashSirPro;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter No. Of Rows:-");
		int n = s.nextInt();
		int[][] triangle = generateTriangle(n);
		for (int[] row : triangle) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	public static int[][] generateTriangle(int n) {
		int[][] triangle = new int[n][];
		for (int i = 0; i < n; i++) {
			triangle[i] = new int[i + 1];
			triangle[i][0] = 1;
			triangle[i][i] = 1;
			for (int j = 1; j < i; j++) {
				triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
			}
		}
		return triangle;
	}
}
