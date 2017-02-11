import java.util.Scanner;

public class Ifelse {

	
	public static void main(String[] args) {
		int score;
		char vote;
		
		System.out.println("Your score:");
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		score = keyboard.nextInt();
		
		if (score >= 90)
			vote = 'A';
		else if (score >= 80)
			vote = 'B';
		else if (score >= 70)
			vote = 'C';
		else if (score >= 60)
			vote = 'D';
		else
			vote = 'F';
		
		System.out.println("Your score is: " + score);
		System.out.println("Your vote is: " + vote);

	}

}
