import java.util.Scanner;
public class Coffee {
	public static double price = 0.00;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		if(userChoice() != 0)
			if(userChoice() != 0)
				userChoice();
		displayPrice();
	}
	public static void menu() {
		System.out.println("-------------------------------------------------------");
		System.out.println("(1)American			$1.99");
		System.out.println("(2)Espresso			$2.50");
		System.out.println("(3)Latte			$2.15");
		System.out.println("-------------------------------------------------------");
	}
	public static int userChoice() {
		System.out.println("Choose a number corresponding to the first item you want to buy: ");
		Scanner input = new Scanner(System.in);
		int userChoice = 0;
		userChoice = input.nextInt();
		switch(userChoice)
		{
		case 0:
			displayPrice();
			break;
		case 1:
			price = price + 1.99;
			break;
		case 2:
			price = price + 2.50;
			break;
		case 3:
			price = price + 2.15;
			break;
		}
		return userChoice;
	}
	public static void displayPrice() {
		System.out.println("Your price total comes out to $" + price);
	}
}
