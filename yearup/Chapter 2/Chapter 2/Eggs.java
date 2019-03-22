import java.util.Scanner;
public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double DOZEN_PRICE = 3.25;
		final double EGG_PRICE = .45;
		int eggs;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("How many eggs in total did you buy?");
		eggs = inputDevice.nextInt();
		int dozen = eggs/12;
		int looseEggs = eggs % 12;
		System.out.println("You ordered " + eggs + " eggs. That's " + dozen + " dozen at $3.25 per dozen and " + looseEggs + " loose eggs at 45.0 cents each for a total of $" + ((dozen * DOZEN_PRICE) + (looseEggs * EGG_PRICE)) + ".");
	}

}
