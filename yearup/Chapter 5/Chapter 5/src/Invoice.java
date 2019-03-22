
public class Invoice {
	private int invoiceNum, day, month, year;
	private double balance;
	public Invoice(int in, double bal, int day, int mon, int year) {
		if(in < 1000)
			in = 0;
		if(mon > 12 || mon < 1)
			mon = 0;
		if(day < 1 || day > 31) 
			day = 0;
		if(year < 2011 || year > 2017)
			year = 0;
		invoiceNum = in;
		balance = bal;
		this.day = day;
		month = mon;
		this.year = year;
	}
	public void display() {
		System.out.println("Invoice Num: " + invoiceNum + "\nBalance due: $" + balance + "\nDate Due: " + month + "/" + day + "/" + year);
	}
}
