import java.util.Scanner;
public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int userChoice;
		System.out.println("Choose 1 for park view, 2 for golf course view, or 3 for lake view: ");
		userChoice = input.nextInt();
		switch(userChoice)
		{
		case 1:
			System.out.println("The park view condo costs $150,000.");
			break;
		case 2:
			System.out.println("The golf view condo costs $170,000.");
			break;
		case 3:
			System.out.println("The lake view condo costs $210,000.");
			break;
		default:
			System.out.println("There is no price for the choice you selected.");
		}
	}

}
