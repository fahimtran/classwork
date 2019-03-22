import java.util.Scanner;
public class GasPrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int pricePerBarrel;
		System.out.println("What is the current Gasoline price per barrel?");
		pricePerBarrel = keyboard.nextInt();
		priceCheck(pricePerBarrel);
	}
	public static void priceCheck(int num) {
		System.out.println("The price of gas should between $" + (3.50 * (num/100.0)) + " and " + 
	(4.00 * (num/100.0)));
	}
}
