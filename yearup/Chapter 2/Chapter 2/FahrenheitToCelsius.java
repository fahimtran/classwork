import java.util.Scanner;
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fahrenheit;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Temperature? ");
		fahrenheit = inputDevice.nextInt();
		int celsius;
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Fahrenheit: " + fahrenheit + "\nCelsius: " + celsius);
	}

}
