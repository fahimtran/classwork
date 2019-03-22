import java.util.Scanner;
public class Dollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dollars;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Total amount? ");
		dollars = inputDevice.nextInt();
		int twenties, tens, fives, ones;
		twenties = dollars/20;
		tens = (dollars % 20)/10;
		fives = ((dollars % 20) % 10)/5;
		ones = (((dollars % 20) % 10) % 5);
		System.out.println("You have " + twenties + " twenties, " + tens + " tens, " + fives + " fives, " +  ones + " ones.");
	}

}
