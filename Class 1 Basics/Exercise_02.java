package section2;

import java.util.Scanner;

public class Exercise_02 {
	private static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the # of students: ");
		int numOfStudents = userInput.nextInt();

		// The first highest score
		System.out.println("Enter a name: ");
		String name_1 = userInput.next();

		System.out.println("Enter a score: ");
		int score_01 = userInput.nextInt();

		// The second highest score
		System.out.println("Enter a name: ");
		String name_02 = userInput.next();

		System.out.println("Enter a score: ");
		int score_02 = userInput.nextInt();

		if (score_01 < score_02){

			String temP_name = name_1;
			int temp_Score = score_01;

			name_1 = name_02;
			score_01 = score_02;

			name_02 = temP_name;
			score_02 = temp_Score;
		}

		for (int i=0; i<numOfStudents-2; i++){
			System.out.println("Enter a name: ");
			String name  =userInput.next();

			System.out.println("Enter a score: ");
			int score = userInput.nextInt();


			if (score > score_01){
				// student 2 becomes the highest
				name_02 = name_1;
				score_02 = score_01;

				// new students becomes the highest
				name_1 = name;
				score_01 = score;
			}else if (score > score_02){
				name_02 = name;
				score_02 = score;
			}
		}
		System.out.println("Top two students are: ");
		System.out.println(name_1 +"'s score is " + score_01);
		System.out.println(name_02 + "'s score is " + score_02);
		}
}

