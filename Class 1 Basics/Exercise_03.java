package section2;

import java.util.Scanner;

public class Exercise_03 {

	public static void main(String[] args) {

		java.util.Scanner userInput = new java.util.Scanner(System.in);

		System.out.println("Enter the # of rows: ");
		int rows = userInput.nextInt();

		for (int i=1; i<rows; i++){
			for (int j=1; j<=i; j++){
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}
