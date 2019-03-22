
public class Bread {
	
	private String breadType;
	private int caloriesPerSlice;
	public final static String MOTTO = "The staff of life";
	
	public Bread(String bt, int cps) {
		
		breadType = bt;
		caloriesPerSlice = cps;
	}
	
	public String getBreadType() {
		
		return breadType;
	}
	
	public int getCaloriesPerSlice() {
		
		return caloriesPerSlice;
	}
	
}
