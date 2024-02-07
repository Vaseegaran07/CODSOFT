import java.util.Scanner;

public class NumberGameTask {

	public static void NumberGame()
	{
		Scanner sc = new Scanner(System.in);
		int chosennumber = 1 + (int)(100*Math.random());
		int trials = 5;

		int i, guess;

		System.out.println("A number is chosen between 1 to 100. Guess the number within 5 trials.");
		for (i = 0; i < trials; i++) {
            System.out.println("Guess the number:");
			guess = sc.nextInt();
			if (chosennumber == guess) {
				System.out.println("Congratulations! You guessed the number.");
				break;
			}
			else if (chosennumber > guess && i != trials - 1) {
				System.out.println("The number is greater than " + guess);
			}
			else if (chosennumber < guess && i != trials - 1) {
				System.out.println("The number is less than " + guess);
			}
		}

		if (i == trials) {
			System.out.println("You have exhausted " + trials + " trials.");

			System.out.println("The number was " + chosennumber);
		}
	}

	public static void main(String arg[])
	{
        NumberGame();
	}
}
