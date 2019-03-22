import java.util.Scanner;
public class RentalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Rental one = new Rental();
		displayMotto();
		one.setContractNumber(getContractNumber());
		calcPrice(getMinutes());
		System.out.println("The Contract Number is: " + one.getContractNumber());
		Rental two = new Rental(getContractNumber(), getMinutes());
		System.out.println("The Contract Number is: " + two.getContractNumber() + "\nTotal Minutes: " + (two.getHours()*60 + two.getExcessMinutes()));
	}
	public static void displayMotto() {
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S                                  S");
		System.out.println("S Sammy's makes it fun in the sun. S");
		System.out.println("S                                  S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
	}
	public static int getMinutes() {
		int minutes;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("How many minutes in total have you rented the equipment?");
		minutes = inputDevice.nextInt();
		return minutes;
	}
	public static void calcPrice(int x) {
		int remainingMinutes, hours, totalPrice;
		hours = x/60;
		remainingMinutes = x % 60;
		totalPrice = (hours * 40) + (remainingMinutes * 1);
		System.out.println("In all, you have rented the equipment for " + hours + 
				" hours and " + remainingMinutes + " minutes and the total price comes out to: $" 
				+ totalPrice);
	}
	public static String getContractNumber() {
		String contractNum;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type in the Contract Number for the Rental");
		contractNum = keyboard.nextLine();
		return contractNum;
	
	}
}
