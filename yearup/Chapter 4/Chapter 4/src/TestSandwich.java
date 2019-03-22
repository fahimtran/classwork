
public class TestSandwich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sandwich one = new Sandwich("rye", 25, "ketchup", 5);
		Sandwich two = new Sandwich("white", 20, "mayonnaise", 30);
		Sandwich three = new Sandwich("whole grain", 30, "mustard", 10);
		
		System.out.println("Here is sandwich data for three sandwiches: \n" + one.type1.getBreadType() + " " + one.type2.getFillingType() + "\nTotal Calories: " 
		+ calorieTotal(one.type1.getCaloriesPerSlice(), one.type2.getCalories()) + "\n" + two.type1.getBreadType() + " " + two.type2.getFillingType() + "\nTotal Calories: " 
		+ calorieTotal(two.type1.getCaloriesPerSlice(), two.type2.getCalories()) + "\n" + three.type1.getBreadType() + " " + three.type2.getFillingType() + "\nTotal Calories: " 
		+ calorieTotal(three.type1.getCaloriesPerSlice(), three.type2.getCalories()));
	}
	
	public static int calorieTotal(int x, int y) {
		
		int total;
		total = (x * 2) + y;
		return total;
	}

}
