
public class TwoDice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Die one = new Die();
		Die two = new Die();
		
		System.out.println("Die One: " + one.getRandomValue() + "\nDie Two: " + two.getRandomValue());
		if(one.getRandomValue() > two.getRandomValue())
			System.out.println("Die One is greater than Die 2.");
		else
			if(one.getRandomValue() == two.getRandomValue())
				System.out.println("Die One is equal to Die 2.");
			else
				System.out.println("Die Two is greater than Die One.");
		
	}

}
