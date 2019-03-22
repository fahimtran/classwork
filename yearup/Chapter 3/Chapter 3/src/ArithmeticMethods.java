
public class ArithmeticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integerOne = 10;
		int integerTwo = 20;
		displayNumberPlus10(integerOne);
		displayNumberPlus10(integerTwo);
		displayNumberPlus100(integerOne);
		displayNumberPlus100(integerTwo);
		displayNumberPlus1000(integerOne);
		displayNumberPlus1000(integerTwo);
	}
	public static void displayNumberPlus10(int num) {
		System.out.println("The requested number plus 10 is " + (num + 10));
	}
	public static void displayNumberPlus100(int num) {
		System.out.println("The requested number plus 100 is " + (num + 100));

	}
	public static void displayNumberPlus1000(int num) {
		System.out.println("The requested number plus 1000 is " + (num + 1000));

	}
}
