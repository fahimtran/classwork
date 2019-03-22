import java.util.Scanner;
public class EventDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event one = new Event();
		displayMotto();
		one.setEventNumber(setEventNumber());
		one.setGuests(setGuests());
		calcPriceAndSize(one.getGuests());
		System.out.println("Your Event Number: " + one.getEventNumber());
		Event two = new Event(setEventNumber(), setGuests());
		System.out.println("Your Event Number: " + two.getEventNumber());
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
	public static String setEventNumber() {
		System.out.println("Enter an Event Number");
		String eventNum;
		Scanner keyboard = new Scanner(System.in);
		eventNum = keyboard.nextLine();
		return eventNum;
	}
}
