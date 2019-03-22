import java.util.Scanner;
public class TestBankAccount {

	public static void getData(BankAccount x) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("For " + x + ", Type your Account Number, your Name, then your Balance:");
		x.setAccountNum(keyboard.nextInt());
		keyboard.nextLine();
		x.setOwnersName(keyboard.nextLine());
		x.setAccountBalance(keyboard.nextInt());
	}
	
	public static void showValues(BankAccount x) {
		System.out.println("This account belongs to " + x.getOwnersName() + " with the account number " 
				+ x.getAccountNum() + " that has a balance of " + x.getAccountBalance());
		x.explainAccountPolicy();
		System.out.println("The account balance is: " + x.getAccountBalance());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount test1 = new BankAccount();
		BankAccount test2 = new BankAccount();
		BankAccount test3 = new BankAccount();
		BankAccount test4 = new BankAccount();
		getData(test1);
		getData(test2);
		getData(test3);
		showValues(test1);
		showValues(test2);
		showValues(test3);
		showValues(test4);
	}

}
