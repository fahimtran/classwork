
public class BloodData {
	
	private String bloodType;
	private String rhFactor;
	
	public void setBloodType(String bt) {
		
		bloodType = bt;
	}
	
	public void getBloodType() {
		
		System.out.print(bloodType);
		
	}
	
	public void setRhFactor(String rh) {
		
		rhFactor = rh;
	}
	
	public void getRhFactor() {
		
		System.out.println(rhFactor);
	}
	
	public void showBloodData() {
		
		getBloodType();
		getRhFactor();
	}
	
	public BloodData() {
		
		bloodType = "O";
		rhFactor = "+";
	}
	
	
	public BloodData(String bt, String rh) {
		
		bloodType = bt;
		rhFactor = rh;
	}
}
