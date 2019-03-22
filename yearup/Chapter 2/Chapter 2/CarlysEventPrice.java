import java.util.Scanner;
public class CarlysEventPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************************************************");
		System.out.println("*                                               *");
		System.out.println("* Carly's makes the food that makes it a party. *");
		System.out.println("*                                               *");
		System.out.println("*************************************************");
		int guests, totalPrice;
		final int PRICE_PER_PERSON = 35;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("How many guests are attending?");
		guests = inputDevice.nextInt();
		totalPrice = PRICE_PER_PERSON * guests;
		System.out.println("There are " + guests + " guests, and with a cost of $35 per person, the total price comes out to " + totalPrice + ".");
		boolean largeEvent = guests >= 50;
		System.out.println("This qualifies as a large event: " + largeEvent);
	}

}
