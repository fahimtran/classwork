
public class DigitalCamera {
	private String brand;
	private int megapixels;
	private double price;
	
	public DigitalCamera(String br, int mp) {
		if(mp > 10)
			mp = 10;
		brand = br;
		megapixels = mp;
		if(mp <= 6)
			price = 99;
		else
			price = 129;
	}
	public void display() {
		System.out.println("Brand: " + brand + "\nMegapixels: " + megapixels + "\nPrice: $" + price);
	}
}
