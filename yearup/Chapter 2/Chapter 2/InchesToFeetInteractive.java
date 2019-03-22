import java.util.Scanner;
public class InchesToFeetInteractive {
	public static void main(String[] args) {
		int inches;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Name the amount of Inches: ");
		inches = inputDevice.nextInt();
		final int INCHES_IN_FEET = 12;
		System.out.println( (inches/INCHES_IN_FEET)+ " feet and " + (inches % INCHES_IN_FEET) + " inches.");
	}
}
