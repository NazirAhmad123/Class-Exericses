package section2;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the # of students: ");
		int numOfStudents = userInput.nextInt();

//		Highest score
		System.out.println("Enter a name: ");
		String name_1 = userInput.next();

		System.out.println("Enter a score: ");
		int score_1 = userInput.nextInt();

		for (int i=0; i<numOfStudents-1; i++){

			System.out.println("Enter a name: ");
			String name = userInput.next();

			System.out.println("Enter a score: ");
			int score = userInput.nextInt();

			if (score > score_1){
				name_1 = name;
				score_1 = score;
			}

		}
		System.out.println(name_1 + "'s score is " + score_1);

	}
}
