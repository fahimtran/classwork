
public class Invoice2 {
	private int invoiceNum, day, month, year;
	private double balance;
	public Invoice2(int in, double bal, int day, int mon, int year) {
		if(in < 1000)
			in = 0;
		if(mon > 12 || mon < 1)
			mon = 0;
		if(day < 1 || day > 31) 
			day = 0;
		if(year < 2011 || year > 2017)
			year = 0;
		if(mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12)
			if(day >= 32)
				day = 31; 
		if(mon == 4 || mon == 5 || mon == 6 || mon == 8 || mon == 9 || mon == 11)
			if(day >= 31)
				day = 30;
		if(mon == 2)
			if(day >= 29)
				day = 28;
		if(mon == 0)
			day = 0;
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
