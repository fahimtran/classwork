import java.util.Scanner;
public class CarlysEventPriceWithMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMotto();
		calcPriceAndSize(setGuests());
	}
	public static void displayMotto() {
		System.out.println("*************************************************");
		System.out.println("*                                               *");
		System.out.println("* Carly's makes the food that makes it a party. *");
		System.out.println("*                                               *");
		System.out.println("*************************************************");
	}
	public static int setGuests() {
		int guests;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many guests are attending?");
		guests = keyboard.nextInt();
		return guests;
	}
	public static void calcPriceAndSize(int x) {
		int totalPrice;
		final int PRICE_PER_PERSON = 35;
		totalPrice = PRICE_PER_PERSON * x;
		System.out.println("There are " + x + " guests, and with a cost of $35 per person, the total price comes out to " + totalPrice + ".");
		boolean largeEvent = x >= 50;
		System.out.println("This qualifies as a large event: " + largeEvent);
	}
}
