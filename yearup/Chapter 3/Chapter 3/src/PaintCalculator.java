import java.util.Scanner;
public class PaintCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int length, width, height;
		System.out.println("Type in the length, width, and height of a rectangular room in that order:");
		length = keyboard.nextInt();
		width = keyboard.nextInt();
		height = keyboard.nextInt();
		paintPrice(length, width, height);
	}
	public static void paintPrice(int x, int y, int z) {
		int wallArea = (2 * (z * y)) + (2 * (z * x));
		System.out.println("You need " + gallonsNeeded(wallArea) + " gallons of paint");
		System.out.println("The price per gallon of paint is $32 and your total comes out to $" + priceTotal(gallonsNeeded(wallArea)));
	}
	public static int gallonsNeeded(int feetCovered) {
		int gallons;
		final int AREA_COVERED_BY_GALLON_OF_PAINT = 350;
		gallons = feetCovered / AREA_COVERED_BY_GALLON_OF_PAINT;
		return gallons;
	}
	public static int priceTotal(int gallons) {
		int finalPrice;
		final int PRICE_OF_GALLON_OF_PAINT = 32;
		finalPrice = PRICE_OF_GALLON_OF_PAINT * gallons;
		return finalPrice;
	}
}
