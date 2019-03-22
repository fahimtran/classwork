import java.util.Scanner;
public class TestPainting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Painting one = new Painting();
		Painting two = new Painting();
		Painting three = new Painting();
		getData(one);
		getData(two);
		displayData(one);
		displayData(two);
		displayData(three);
	}
	
	public static void getData(Painting name) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please input the Name, Artist, Medium, and Price of Painting " + name);
		name.setTitle(keyboard.nextLine());
		name.setArtist(keyboard.nextLine());
		name.setMedium(keyboard.nextLine());
		name.setPrice(keyboard.nextDouble());
	}
	public static void displayData(Painting name) {
		System.out.println("The title of this painting is: " + name.getTitle() + "\nThe Artist of this painting is: " + name.getArtist() 
		+ "\nThe medium the artist used to paint this painting was: " + name.getMedium() + "\nThe price of this painting is: $" + name.getPrice()
		+ "\n And the Gallery Commission is: $" + name.getCommission());
	}
}
