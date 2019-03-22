
public class ShowStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student john = new Student();
		john.setCreditHours(12);
		john.setIdNum(1234);
		john.setPointsEarned(48);
		john.gpaCalc(john.getPointsEarned(), john.getCreditHours());
		john.displayStats();
	}

}
