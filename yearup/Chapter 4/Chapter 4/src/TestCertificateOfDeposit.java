import java.util.Scanner;
public class TestCertificateOfDeposit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		CertificateOfDeposit one, two;
		int onean, twoan, oneid, twoid;
		double onebal, twobal;
		String oneln, twoln;
		
		System.out.println("Please enter the Account Number, Account Holder's Last Name, Balance, and Issue Date of CD One: ");
		
		onean = keyboard.nextInt();
		keyboard.nextLine();
		oneln = keyboard.nextLine();
		onebal = keyboard.nextDouble();
		oneid = keyboard.nextInt();
		
		one = new CertificateOfDeposit(onean, oneln, onebal, oneid);
		
		System.out.println("Please enter the Account Number, Account Holder's Last Name, Balance, and Issue Date of CD Two: ");
		
		twoan = keyboard.nextInt();
		keyboard.nextLine();
		twoln = keyboard.nextLine();
		twobal = keyboard.nextDouble();
		twoid = keyboard.nextInt();
		
		two = new CertificateOfDeposit(twoan, twoln, twobal, twoid);
		
		displayCD(one);
		displayCD(two);
	}
	
	public static void displayCD(CertificateOfDeposit x) {
		
		System.out.println("\n---Account Info--- \nCertificate Number: " + x.getCertificateNumber() + "\nLast name: " + x.getAccountLastName() + "\n$" + x.getBalance() 
		+ "\nIssue Date: " + x.getIssueDate() + "\nMaturity Date: " + x.getMaturityDate());
	}

}
