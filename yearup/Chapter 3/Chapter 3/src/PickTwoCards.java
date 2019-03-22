
public class PickTwoCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randCardOne, randCardTwo;
		char cardOne = 's', cardTwo = 'c';
		final int CARDS_IN_SUIT = 13;
		randCardOne = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		randCardTwo = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		System.out.println("These are the cards " + randCardOne + " and " + randCardTwo);
	}

}
