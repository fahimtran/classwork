import java.util.Scanner;
public class RandomGuessMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random, guess;
		final int MAX = 5;
		Scanner inputDevice = new Scanner(System.in);
		random = 1 + (int)(Math.random() * MAX);
		System.out.println("Guess a number between 1 and 5: ");
		guess = inputDevice.nextInt();
		System.out.println("The difference between your guess and the actual number is: " + 
		(guess - random));
		System.out.println("Guess again: ");
		guess = inputDevice.nextInt();
		boolean valid = guess == random;
		System.out.println("Your guess is " + valid);
	}

}
