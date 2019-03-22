
public class TestSandwichFilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SandwichFilling ketchup = new SandwichFilling("ketchup", 5);
		SandwichFilling mustard = new SandwichFilling("mustard", 10);
		SandwichFilling mayonnaise = new SandwichFilling("mayonnaise", 50);
		
		System.out.println(ketchup.getFillingType() + " " + ketchup.getCalories() + "\n" +
		mustard.getFillingType() + " " + mustard.getCalories() + "\n" + 
				mayonnaise.getFillingType() + " " + mayonnaise.getCalories());
	}

}
