package assignment;

import java.util.Scanner;

public class Number5 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter noOfTest:-");
			int noOfTest = s.nextInt();
			String[][][] a=new String[3][noOfTest][1];
			System.out.println("Enter student grade:-");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					for (int j2 = 0; j2 < a[0][0].length; j2++) {
						a[i][j][j2]=s.next();
					}
				}
			}
			System.out.println("Enter student number:-");
			int studentNo=s.nextInt(); 
			System.out.println("Enter test number:-");
			int testNo=s.nextInt();
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					for (int j2 = 0; j2 < a[0][0].length; j2++) {
						if(i+1==studentNo && j+1==testNo)
						{
							System.out.println("test grade is:-"+a[i][j][j2]);
						}
					}
				}
			}
		}
	}
}
