import java.util.GregorianCalendar;
public class CertificateOfDeposit {
	
	GregorianCalendar now = new GregorianCalendar();
	private int certificateNumber;
	private String accountLastName;
	private double balance;
	private int issueDate;
	private int maturityDate;
	
	public CertificateOfDeposit(int cn, String aln, double bal, int iD) {
		
		certificateNumber = cn;
		accountLastName = aln;
		balance = bal;
		issueDate = iD;
		maturityDate = issueDate + 365;
	}
	
	public void setCertificateNumber(int x) {
		
		certificateNumber = x;
	}
	
	public int getCertificateNumber() {
		
		return certificateNumber;
	}
	
	public void setAccountLastName(String x) {
		
		accountLastName = x;
	}
	
	public String getAccountLastName() {
		
		return accountLastName;
	}
	
	public void setBalance(double x) {
		
		balance = x;
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	public int getIssueDate() {
		
		return issueDate;
	}
	
	public int getMaturityDate() {
		
		return maturityDate;
	}
}
