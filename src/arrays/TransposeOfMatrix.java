package arrays;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter Row Size:=");
			int row=s.nextInt();
			System.out.println("Enter Column Size:= ");
			int column=s.nextInt();
			int [][]a=new int[row][column];
			System.out.println("Enter element:=");
			for (int i = 0; i < a.length; i++) {
				System.out.println("Enter element for "+(i+1)+" Row");
				for (int j = 0; j < a[0].length; j++) {
					a[i][j]=s.nextInt();
				}	
			}
			System.out.println("Orginal Matrix:=");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			int [][]transpose=new int[column][row];
			for (int i = 0; i < transpose.length; i++) {
				for (int j = 0; j < transpose[0].length; j++) {
					transpose[i][j]=a[j][i];
				}
			}
			System.out.println("Transpose of given Matrix:=");
			for (int i = 0; i < transpose.length; i++) {
				for (int j = 0; j < transpose[0].length; j++) {
					System.out.print(transpose[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
