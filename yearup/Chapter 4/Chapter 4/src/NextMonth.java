import java.util.Calendar;
import java.util.GregorianCalendar;
public class NextMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar now = new GregorianCalendar();
		System.out.println("There are about " + (Calendar.DAY_OF_MONTH / 31) + " or " + (Calendar.DAY_OF_MONTH / 31 + 1) + " days left in this month");
	}

}
