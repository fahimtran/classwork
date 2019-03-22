import java.util.GregorianCalendar;
public class YearEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar now = new GregorianCalendar();
		System.out.println("There are about " + (366 - now.DAY_OF_YEAR) + " or " + (365 - now.DAY_OF_YEAR) + " days left in this year");
	}

}
