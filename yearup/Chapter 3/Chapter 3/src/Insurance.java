import java.util.Scanner;
public class Insurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int currentYear, birthYear;
		System.out.println("Type in the current year and your birth year separated by the Enter key:");
		currentYear = keyboard.nextInt();
		birthYear = keyboard.nextInt();
		System.out.println("The premium you have to pay is $" + premiumAmount(currentYear, birthYear) + " each month");
		
	}
	public static int premiumAmount(int x, int y) {
		int price;
		int currentAge = x - y;
		int decades = currentAge/10;
		price = (decades + 15) * 20;
		return price;
	}
}
