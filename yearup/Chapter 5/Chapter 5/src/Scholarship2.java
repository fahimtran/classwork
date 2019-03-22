import java.util.Scanner;
public class Scholarship2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double userGpa;
		int extraAct, serviceAct;
		System.out.println("Type in your high school gpa, your number of extracurricular activities, and your number of service activities in that order separated by the Enter key: ");
		userGpa = input.nextDouble();
		extraAct = input.nextInt();
		serviceAct = input.nextInt();
		if(userGpa > 4.0 || userGpa < 0 || extraAct < 0 || serviceAct < 0)
			System.out.println("An error has occurred");
		if(userGpa >= 3.8 && extraAct >= 1 && serviceAct >= 1)
			System.out.println("Scholarship candidate");
		else
			if((3.4 <= userGpa && 3.8 >= userGpa) && (extraAct + serviceAct >= 3))
				System.out.println("Scholarship candidate");
			else
				if((3.0 <= userGpa && 3.4 >= userGpa) && extraAct >= 2 && serviceAct >= 3)
					System.out.println("Scholarship candidate");
				else
					System.out.println("Not a candidate");
	}

}
