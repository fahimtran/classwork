
public class Die {
	
	private int randomValue;
	public static final int HIGHEST_DIE_VALUE = 6;
	public static final int LOWEST_DIE_VALUE = 1;
	
	public Die() {
		
		randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}
	
	public void dieRoll() {
		
		randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}
	
	public int getRandomValue() {
		
		return randomValue;
	}
}
