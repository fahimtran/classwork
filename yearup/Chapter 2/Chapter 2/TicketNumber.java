import java.util.Scanner;
public class TicketNumber {
	public static void main(String[] args) {
		int ticket, remainder, firstFive;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Type in the Six-Digit Ticket Number: ");
		ticket = inputDevice.nextInt();
		firstFive = ticket / 10;
		remainder = ticket % 10;
		boolean validity = firstFive == remainder;
		System.out.println("That is a " + validity + " ticket number.");
	}
}
