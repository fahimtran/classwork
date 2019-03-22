import java.util.Scanner;
public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int skill, insurance, retirement, hoursWorked;
		double payRate, overtimePay = 0.00, insuranceCost = 0.00, retirementCost = 0.00, grossPay = 0.00, regularPay = 0.00;
		System.out.println("Please input your skill level and hours worked: ");
		skill = input.nextInt();
		hoursWorked = input.nextInt();
		switch(skill) {
		case 1:
			payRate = 17.00;
			break;
		case 2:
			payRate = 20.00;
			break;
		case 3:
			payRate = 22.00;
			break;
		default:
			payRate = 0.00;
			break;
		}
		if(hoursWorked > 40) {
			overtimePay = (hoursWorked - 40) * (1.5 * payRate);
		}
		regularPay = 40 * payRate;
		grossPay = regularPay + overtimePay;
		if(skill >= 2){
			insuranceDisplay();
			System.out.println("Choose an insurance plan by choosing a number: ");
			insurance = input.nextInt();
			switch(insurance) {
			case 1:
				insuranceCost = 32.50;
			case 2:
				insuranceCost = 20.00;
			case 3:
				insuranceCost = 10.00;
			}
			if(skill == 3) {
				System.out.println("Since you're in skill level 3, you can opt in our retirement plan at 3% of your gross pay. \nEnter 1 to opt in and 2 otherwise.");
				retirement = input.nextInt();
				if(retirement == 1) {
					retirementCost = .03 * grossPay;
				}
			}
		}
		System.out.println("\n\nHours worked: " + hoursWorked + "\nPay Rate: $" + payRate + " an hour. \nRegular pay for 40 hours: $" + (payRate * 40) + 
				"\nOvertime pay: $" + overtimePay + "\nTotal of regular and overtime pay: $" + grossPay + "\nTotal of itemized deductions: $" + (insuranceCost + retirementCost));
	}
	public static void insuranceDisplay() {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Option		Explanation					Weekly Cost to Employee ($)");
		System.out.println("1		Medical insurance						32.50");
		System.out.println("2		Dental insurance						20.00");
		System.out.println("3		Long-term disability insurance 					10.00");
		System.out.println("-----------------------------------------------------------------------------------------");

	}

}
