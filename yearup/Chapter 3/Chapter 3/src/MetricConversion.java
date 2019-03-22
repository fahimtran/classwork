import java.util.Scanner;
public class MetricConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double inches;
		double gallons;
		System.out.println("Type in two numbers, an amount of inches and an amount of gallons to be converted separated by the Enter key:");
		inches = keyboard.nextDouble();
		gallons = keyboard.nextDouble();
		incToCen(inches);
		galToLit(gallons);
	}
	public static void incToCen(double x) {
		final double CENTIMETERS_PER_INCH = 2.54;
		System.out.println("The amount of centimeters in " + x + " inches is " + (CENTIMETERS_PER_INCH * x) + 
				" centimeters");
	}
	public static void galToLit(double x) {
		final double LITERS_PER_GALLON = 3.7854;
		System.out.println("The amount of liters in " + x + " gallons is " + (LITERS_PER_GALLON * x) + " liters");
	}
}
