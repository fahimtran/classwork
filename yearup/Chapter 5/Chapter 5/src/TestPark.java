
public class TestPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Park one, two, three;
		one = new Park();
		two = new Park();
		three = new Park();
		playpicCheck(one);
		allCheck(two, true, false, true, false);
		facilitiesCheck(three);
	}
	public static boolean playpicCheck(Park x) {
		boolean check;
		check = x.getPicnic() && x.getPlay();
		return check;
	}
	public static boolean allCheck(Park x, boolean a, boolean b, boolean c, boolean d) {
		boolean check;
		if(x.getPicnic() == a && x.getTennis() == b && x.getPlay() == c && x.getPool() == d)
			check = true;
		else
			check = false;
		return check;
	}
	public static int facilitiesCheck(Park x) {
		int facilities = 0;
		if(x.getPicnic() == true)
			facilities = facilities + 1;
		if(x.getPlay() == true) 
			facilities = facilities + 1;
		if(x.getPool() == true) 
			facilities = facilities + 1;
		if(x.getTennis() == true) 
			facilities = facilities + 1;
		return facilities;
	}
	public static Park largeCheck(Park x, Park y) {
		if(x.getAcres() > y.getAcres())
			return x;
		else
			return y;
	}
}
