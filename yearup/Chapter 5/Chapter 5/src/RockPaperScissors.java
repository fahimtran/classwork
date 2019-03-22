import java.util.*;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int comp, user;
		comp = (((int)Math.random() * 100) % 3 + 1);
		System.out.println("Choose 1 for Rock, 2 for Scissors, and 3 for Paper: ");
		user = input.nextInt();
		if((comp == 1 && user == 2) || (comp == 2 && user == 3) || (comp == 3 && user == 1))
			System.out.println("You lose!");
		else
			if(comp == user)
				System.out.println("It's a draw.");
			else
				System.out.println("You win!");
	}

}
