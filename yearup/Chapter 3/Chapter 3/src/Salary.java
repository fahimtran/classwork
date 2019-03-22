import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int hourlyPayRate, regularHours, overtimeHours;
		System.out.println("What is your hourly pay rate, your regular hours per week, and your overtime hours?");
		hourlyPayRate = keyboard.nextInt();
		regularHours = keyboard.nextInt();
		overtimeHours = keyboard.nextInt();
		System.out.println("Your weekly salary is $" + salary(hourlyPayRate, regularHours, overtimeHours));
		
	}
	public static double salary(int x, int y, int z) {
		double pay;
		pay = x * y + ((1.5 * x) * z);
		return pay;
	}
}
