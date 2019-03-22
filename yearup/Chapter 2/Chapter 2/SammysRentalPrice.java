import java.util.Scanner;
public class SammysRentalPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S                                  S");
		System.out.println("S Sammy's makes it fun in the sun. S");
		System.out.println("S                                  S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		int minutes, remainingMinutes, hours, totalPrice;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("How many minutes in total have you rented the equipment?");
		minutes = inputDevice.nextInt();
		hours = minutes/60;
		remainingMinutes = minutes % 60;
		totalPrice = (hours * 40) + (remainingMinutes * 1);
		System.out.println("In all, you have rented the equipment for " + hours + 
				" hours and " + remainingMinutes + " minutes and the total price comes out to: $" 
				+ totalPrice);
	}

}
