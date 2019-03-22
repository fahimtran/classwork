import java.util.Scanner;
public class TwoCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCharacter one = new MyCharacter();
		MyCharacter two = new MyCharacter();
		getData(one);
		getData(two);
		displayData(one);
		displayData(two);
	}
	public static void getData(MyCharacter name) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type in the character's Height, Weight, and Strength in that order:");
		name.setHeight(keyboard.nextInt());
		name.setWeight(keyboard.nextInt());
		name.setStrength(keyboard.nextInt());
		
	}
	public static void displayData(MyCharacter name) {
		System.out.println("This character is " + name.getHeight() + " tall, " + name.getWeight() + " heavy, and " + name.getStrength() + " strong.");
	}
}
