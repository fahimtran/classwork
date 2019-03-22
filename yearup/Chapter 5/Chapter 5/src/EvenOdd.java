import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInt;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		userInt = input.nextInt();
		if((userInt % 2) == 0)
			System.out.println("Your number is even!");
		else
			System.out.println("Your number is odd!");
	}

}
