
public class FormLetterWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displaySalutation("boi");
		displaySalutation("Yeller", "boi");
	}
	
	public static void displaySalutation(String lastName) {
		
		System.out.println("Dear Mr. or Ms. " + lastName);
	}
	
	public static void displaySalutation(String firstName, String lastName) {
		
		System.out.println("Dear Mr. or Ms. " + firstName + " " + lastName);
	}
}
