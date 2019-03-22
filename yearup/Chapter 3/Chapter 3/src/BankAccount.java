
public class BankAccount {
	private int accountNum;
	private String ownersName;
	private int accountBalance;
	public void setAccountNum(int x) {
		accountNum = x;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setOwnersName(String x) {
		ownersName = x;
	}
	public String getOwnersName() {
		return ownersName;
	}
	public void setAccountBalance(int x) {
		accountBalance = x;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void deductMonthlyFee() {
		accountBalance = accountBalance - 4;		
	}
	public static void explainAccountPolicy() {
		System.out.println("There will be a $4 fee every month that will be deducted from your bank account.");
	}
	public BankAccount() {
		accountNum = 9999999;
		ownersName = "John Appleseed";
		accountBalance = 5;
	}
}
