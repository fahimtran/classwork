import java.util.Scanner;
public class CondoSales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int userChoice, userChoice2, price = 0;
		System.out.println("Choose 1 for park view, 2 for golf course view, or 3 for lake view: ");
		userChoice = input.nextInt();
		switch(userChoice)
		{
		case 1:
			System.out.println("The park view condo you chose costs $150,000.");
			price = 150000;
			break;
		case 2:
			System.out.println("The golf view condo you chose costs $170,000.");
			price = 170000;
			break;
		case 3:
			System.out.println("The lake view condo you chose costs $210,000.");
			price = 210000;
			break;
		default:
			System.out.println("There is no price for the choice you selected.");
			break;
		}
		
		System.out.println("Choose 1 for a garage or 2 for parking space: ");
		userChoice2 = input.nextInt();
		switch(userChoice2)
		{
		case 1:
			price = price + 5000;
			System.out.println("The garage you chose for your condo costs $5000. \nThe total price of your order comes out to $" + price + ".");
			break;
		case 2:
			System.out.print("Parking space comes free with the condo you ordered. \nThe total price of your order comes out to $" + price +".");
		}
	}

}
