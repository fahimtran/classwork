
public class Event {
	public final static int PRICE_PER_GUEST = 35;
	public final static int CUTOFF_VALUE = 50;
	private String eventNum;
	private int guestNum;
	private int price;
	public void setEventNumber(String x) {
		eventNum = x;
	}
	public void setGuests(int x) {
		guestNum = x;
		price = guestNum * PRICE_PER_GUEST;
	}
	public String getEventNumber() {
		return eventNum;
	}
	public int getGuests() {
		return guestNum;
	}
	public int getPrice() {
		return price;
	}
}
