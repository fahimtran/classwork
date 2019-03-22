import java.util.Scanner;
public class MilesToFeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distanceMiles;
		int distanceFeet;
		Scanner inputDevice = new Scanner(System.in);
		final int FEETS_IN_MILE = 5280;
		System.out.println("What is the distance between my house and my uncle's? >>");
		distanceMiles = inputDevice.nextInt();
		distanceFeet = distanceMiles * FEETS_IN_MILE;
		System.out.println("The distance to my uncle's house is " + distanceMiles + " miles or " + distanceFeet + " feet.");
	}

}
