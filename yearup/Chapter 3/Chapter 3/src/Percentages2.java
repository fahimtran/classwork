import java.util.Scanner;
public class Percentages2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double doubleOne;
		double doubleTwo;
		System.out.println("Type in two numbers separated by the Enter key:");
		doubleOne = keyboard.nextDouble();
		doubleTwo = keyboard.nextDouble();
		computePercent(doubleOne, doubleTwo);
		computePercent(doubleTwo, doubleOne);
	}
	public static void computePercent(double x, double y) {
		System.out.println(x + " is " + (100 * (x / y)) + "% of " + y);
	}
}
