
public class BirdSighting2 {
	
	private String birdSpecies;
	private int numberSeen;
	private int dayOfTheYear;
	
	public void getBirdSpecies() {
		
		System.out.println(this.birdSpecies);
	}
	
	public void getNumberSeen() {
		
		System.out.println(this.numberSeen);
	}
	
	public void getDayOfTheYear() {
		
		System.out.println(this.dayOfTheYear);
	}
	
	public BirdSighting2() {
		
		this("robin", 1, 1);
	}
	
	public BirdSighting2(String x, int y, int z) {
		
		birdSpecies = x;
		numberSeen = y;
		dayOfTheYear = z;
	}
}
