
public class SandwichFilling {

	private String fillingType;
	private int caloriesInAServing;
	
	public SandwichFilling(String ft, int cias) {
		
		fillingType = ft;
		caloriesInAServing = cias;
	}
	
	public String getFillingType() {
		
		return fillingType;
	}
	
	public int getCalories() {
		
		return caloriesInAServing;
	}
}
