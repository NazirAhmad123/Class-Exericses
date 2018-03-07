import java.util.Scanner;

public class LastQuestion {
	public static void main(String[] args) {
		int[] scores = new int[20];
		int newScore;
		int count =0;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Enter a new score: ");
			newScore = in.nextInt();
			
			if(newScore >= 0){
				scores[count] = newScore;
				sum+=newScore;
				count++;
			}
		}while(newScore >= 0);
		System.out.println("Number of scores entered: " + count);
		
		double average = sum/count;
		
		int numOfScoreAboveAverage = 0;
		int numOfScoreBelowAverage = 0;
		
		for(int i=0; i<=count; i++){
			if(scores[i] > average){
				numOfScoreAboveAverage++;
			}else {
				numOfScoreBelowAverage++;
			}
		}
		System.out.println("Average is: " + average);
		System.out.println("# of scores above average: " + numOfScoreAboveAverage);
		System.out.println("# of scores below average: " + numOfScoreBelowAverage);
	}

}
