import java.util.GregorianCalendar;
public class BirdSighting {
	
	GregorianCalendar now = new GregorianCalendar();
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
	
	public BirdSighting() {
		
		birdSpecies = "robin";
		numberSeen = 1;
		dayOfTheYear = 1;
	}
	
	public BirdSighting(String x, int y, int z) {
		
		birdSpecies = x;
		numberSeen = y;
		dayOfTheYear = z;
	}
}
