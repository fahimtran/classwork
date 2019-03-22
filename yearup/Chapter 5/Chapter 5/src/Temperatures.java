import java.util.Scanner;
public class Temperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int todayHigh, todayLow;
		final int HIGH = 90, LOW = 32;
		System.out.println("Put in the High and the Low temperatures for today in that order: ");
		todayHigh = input.nextInt();
		todayLow = input.nextInt();
		if(todayHigh >= HIGH)
			System.out.println("Heat warning.");
		else
			if(todayLow <= LOW)
				System.out.println("Freeze warning.");
		if((todayHigh - todayLow) > 40)
			System.out.println("Large temperature swing.");
	}

}
