
public class Rental {
	public final static int MINUTES_IN_HOUR = 60;
	public final static int HOURLY_RENTAL_RATE = 40;
	private String contractNum;
	private int hours;
	private int excessMin;
	private int price;
	public void setContractNumber(String x) {
		contractNum = x;
	}
	public void setHoursAndMinutes(int x) {
		hours = x/MINUTES_IN_HOUR;
		excessMin = x % MINUTES_IN_HOUR;
		price = (40 * hours) + excessMin;
	}
	public String getContractNumber() {
		return contractNum;
	}
	public int getExcessMinutes() {
		return excessMin;
	}
	public int getHours() {
		return hours; 
	}
	public int getPrice() {
		return price;
	}
	public Rental(String cn, int min) {
		setContractNumber(cn);
		setHoursAndMinutes(min);
	}
	public Rental() {
		this("A000", 0);
	}
}
