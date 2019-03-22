import java.util.Scanner;
public class MadLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String noun1, noun2, noun3, noun4;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Choose 4 different nouns: ");
		noun1 = inputDevice.next();
		noun2 = inputDevice.next();
		noun3 = inputDevice.next();
		noun4 = inputDevice.next();
		System.out.println("Mary had a little " + noun1 + "\nOn a one horse open " + 
		noun2 + "\nRock a bye-" + noun3 + "\nAnd a Happy New " + noun4);
	}

}
