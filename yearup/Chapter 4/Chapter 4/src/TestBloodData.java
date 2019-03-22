
public class TestBloodData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BloodData john = new BloodData();
		BloodData appleseed = new BloodData("B", "-");
		
		john.setBloodType("A");
		john.setRhFactor("+");
		
		appleseed.getBloodType();
		john.getRhFactor();
	}

}
