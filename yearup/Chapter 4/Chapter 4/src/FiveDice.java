
public class FiveDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Die one = new Die();
		Die two = new Die();
		Die three = new Die();
		Die four = new Die();
		Die five = new Die();
		Die six = new Die();
		Die seven = new Die();
		Die eight = new Die();
		Die nine = new Die();
		Die ten = new Die();
		
		System.out.println("Computer Dice: " + one.getRandomValue() + two.getRandomValue() + three.getRandomValue() + four.getRandomValue() + five.getRandomValue());
		System.out.println("Player Dice: " + six.getRandomValue()
		+ seven.getRandomValue() + eight.getRandomValue() + nine.getRandomValue() + ten.getRandomValue());
	}

}
