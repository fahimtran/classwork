
public class Sandwich {

	public Bread type1;
	public SandwichFilling type2;
	
	public Sandwich(String bt, int cps, String sf, int cias) {
		
		type1 = new Bread(bt, cps);
		type2 = new SandwichFilling(sf, cias);
	}
}
