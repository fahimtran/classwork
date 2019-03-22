import java.util.Scanner;
public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double investment;
		System.out.println("Type in your starting investment value:");
		investment = keyboard.nextDouble();
		System.out.println("Your investment is predicted to grow to $" + interestCalc(investment));
	}
	public static double interestCalc(double x) {
		final double INTEREST = 1.05;
		double gains;
		gains = x * INTEREST;
		return gains;
	}
}
