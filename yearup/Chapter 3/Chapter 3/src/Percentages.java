package Chapter3;
public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double doubleOne = 10.5;
		double doubleTwo = 20.75;
		computePercent(doubleOne, doubleTwo);
		computePercent(doubleTwo, doubleOne);
	}
	public static void computePercent(double x, double y) {
		System.out.println(x + " is " + (100 * (x / y)) + "% of " + y);
	}
}
