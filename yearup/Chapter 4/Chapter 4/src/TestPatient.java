
public class TestPatient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patient john = new Patient();
		john.displayPatient();
		Patient appleseed = new Patient("123", 15, "K", "+");
		appleseed.displayPatient();
		john.setAge(20);
		john.setPatientID("122");
		john.setBloodData("B", "-");
		john.displayPatient();
	}

}
