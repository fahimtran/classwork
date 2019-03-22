
public class Patient {
	
	private String patientID;
	private int age;
	private BloodData type;
	
	public void displayPatient() {
		
		getPatientID();
		getAge();
		getBloodData();
	}
	
	public Patient() {
		
		this("0", 0, "O", "+");
	}
	
	public void setPatientID(String id) {
		
		patientID = id;
	}
	
	public void getPatientID() {
		
		System.out.println(patientID);
	}
	
	public void setAge(int age) {
		
		this.age = age;
	}
	
	public void getAge() {
		
		System.out.println(age);
	}
	
	public void setBloodData(String bt, String rh) {
		
		type.setBloodType(bt);
		type.setRhFactor(rh);
	}
	
	public void getBloodData() {
		
		type.getBloodType();
		type.getRhFactor();
	}
	
	public Patient(String id, int age, String bt, String rh) {
		
		type = new BloodData(bt, rh);
		patientID = id;
		this.age = age;
	}
}
