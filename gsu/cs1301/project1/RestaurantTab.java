import java.util.Scanner;

/**
 * Calculates the total price of a restaurant tab.
 *
 * @author Fahim Jeylani-Tran
 * @version 2/22/20
 */
public class RestaurantTab {
    public static void main(String[] args) {
        // Declares constants for tax and tip
        final double TAX_RATE = 7.5 / 100;
        final double TIP_RATE = 18.0 / 100;

        // Creates Scanner Object for user input
        Scanner in = new Scanner(System.in);

        // Prompts user for server's name and the charge
        System.out.print("What is the first name of the server? ");
        String serverFirstName = in.next();
        System.out.print("What is the last name of the server? ");
        String serverLastName = in.next();
        System.out.print("What is the charge for the meal? ");
        double charge = in.nextDouble();

        // Calculates and prepares Restaurant Bill Summary
        String server = serverLastName + ", " + serverFirstName.charAt(0);
        double tax = charge * TAX_RATE;
        double subtotal = charge + tax;
        double tip = subtotal * TIP_RATE;
        double total = subtotal + tip;

        // Displays Restaurant Bill Summary
        System.out.printf("%nRestaurant Bill Summary%n");
        System.out.printf("Server:  %s%n", server);
        System.out.printf("Meal:    $%,.2f%n", charge);
        System.out.printf("Tax:     $%,.2f%n", tax);
        System.out.printf("Tip:     $%,.2f%n", tip);
        System.out.printf("Total:   $%,.2f%n", total);
    }
}