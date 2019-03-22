import java.util.Scanner;
public class DogBoarding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PRICE_OF_BOARDS = .50;
		Scanner deviceInput = new Scanner(System.in);
		int days, weight;
		System.out.println("Weight? ");
		weight = deviceInput.nextInt();
		System.out.println("Days? ");
		days = deviceInput.nextInt();
		double totalPrice;
		totalPrice = (PRICE_OF_BOARDS * weight * days);
		System.out.println("Your total price for boarding is: $" + totalPrice);
	}

}
