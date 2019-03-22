import java.util.Scanner;
public class TestDigitalCamera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DigitalCamera one, two, three, four;
		System.out.println("Type in a brand and megapixels: ");
		one = new DigitalCamera(input.nextLine(), input.nextInt());
		input.nextLine();
		System.out.println("Type in a brand and megapixels: ");
		two = new DigitalCamera(input.nextLine(), input.nextInt());
		input.nextLine();
		System.out.println("Type in a brand and megapixels: ");
		three = new DigitalCamera(input.nextLine(), input.nextInt());
		input.nextLine();
		System.out.println("Type in a brand and megapixels: ");
		four = new DigitalCamera(input.nextLine(), input.nextInt());
		input.nextLine();
		one.display();
		two.display();
		three.display();
		four.display();
		
	}

}
