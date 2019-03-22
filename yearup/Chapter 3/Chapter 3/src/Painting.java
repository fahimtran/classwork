
public class Painting {
	private String title;
	private String artist;
	private String medium;
	private double price;
	private double commission;
	
	public void setTitle(String x) {
		title = x;
	}
	public String getTitle() {
		return title;
	}
	public void setArtist(String x) {
		artist = x;
	}
	public String getArtist() {
		return artist;
	}
	public void setMedium(String x) {
		medium = x;
	}
	public String getMedium() {
		return medium;
	}
	public void setPrice(double x) {
		price = x;
		commission = .2 * price;
	}
	public double getPrice() {
		return price;
	}
	private void setCommission(final double x) {
		commission = x;
	}
	public double getCommission() {
		return commission;
	}
	public Painting() {
		title = "The Mona Lisa";
		artist = "John Appleseed";
		medium = "Charcoal";
		price = 3.50;
	}
}
