
public class Student {
	private int idNum;
	private int creditHours;
	private int pointsEarned;
	private int gpa;
	public void gpaCalc(int x, int y) {
		gpa = x / y;
	}
	public int getGpa() {
		return gpa;
	}
	public void setIdNum(int x) {
		idNum = x;
	}
	public int getIdNum() {
		return idNum;
	}
	public void setCreditHours(int x) {
		creditHours = x;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setPointsEarned(int x) {
		pointsEarned = x;
	}
	public int getPointsEarned() {
		return pointsEarned;
	}
	public void displayStats() {
		System.out.println("Your ID Number is: " + getIdNum() + "\nYour Credit Hours are: " 
	+ getCreditHours() + " hours \nYour Points Earned are: " + getPointsEarned() 
	+ " points \nYour GPA is: " + getGpa());
	}
	public Student() {
		idNum = 9999;
		creditHours = 3;
		pointsEarned = 12;
	}
}
