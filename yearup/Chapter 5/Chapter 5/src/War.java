import java.util.*;
public class PickTwoCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int randCardOne, randCardTwo;
		char cardOne = 's', cardTwo = 'c';
		final int CARDS_IN_SUIT = 13;
		randCardOne = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		randCardTwo = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		System.out.println("The rank of the cards are yours with " + randCardOne + " and the computer with " + randCardTwo);
		if(randCardOne > randCardTwo)
			System.out.println("You win!");
		else
			if(randCardOne == randCardTwo)
				System.out.println("It's a draw!");
			else
				System.out.println("You lose!");
	}

}
