package arrays;

import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of the array:-");
		int size = s.nextInt();
		int[] a1 = new int[size];
		System.out.println("Enter element into array:--");
		for (int i = 0; i < a1.length; i++) {

			a1[i] = s.nextInt();

		}

		int count = 0;
		for (int i = 0; i < a1.length; i++) {

			for (int j = i + 1; j < a1.length; j++) {
				if (a1[i] == a1[j]) {
//					System.out.print(a1[i]);
					count++;
					break;
				}
			}

		}
		if(count==0)
		{
			System.out.println("no duplicate element found");
		}
		else
		{
			System.out.println("duplicate element present in array");
		}

	}

}
