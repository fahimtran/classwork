import java.util.Scanner;

/**
 * An application that calculates geometric formulas.
 *
 * @author Fahim Jeylani-Tran
 * @version 4/7/2020
 */
public class Geometry {
    public static void main(String[] args) {
        // Creates Scanner object for reading input
        Scanner in = new Scanner(System.in);

        // Calls method to display welcome message and menu
        displayMenu();

        // Prompts user for choice and validates it
        System.out.print("Enter your choice (1-3): ");
        int choice = in.nextInt();
        while (choice < 1 || choice > 3) {
            System.out.print("Invalid choice. Please enter 1 - 3: ");
            choice = in.nextInt();
        }

        // Calls selectOption and branches appropriately
        selectOption(choice);

        // Displays farewell message
        System.out.println("\nThanks for using the Geometry Calculator - Goodbye!");
    }

    /**
     * Displays welcome message and menu.
     */
    public static void displayMenu() {
        System.out.println("Welcome to the Geometry Calculator Application");
        System.out.println();
        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
    }

    /**
     * Checks user choice and performs correct area calculation.
     * @param choice from user made from menu
     */
    public static void selectOption(int choice) {
        // Branches options and calls appropriate methods
        if (choice == 1) 
        {
            double area = circle();
            printArea(area);
        }
        else if (choice == 2) 
        {
            double area = rectangle();
            printArea(area);
        }
        else if (choice == 3) 
        {
            double area = triangle();
            printArea(area);
        }
    }

    /**
     * Prints the area passed through as a parameter.
     * @param area of a two dimensional shape
     */
    public static void printArea(double area) {
        System.out.printf("The area is %.2f%n", area);
    }

    /**
     * Prompts user for a radius and returns the area of a circle.
     * @return area of a circle
     */
    public static double circle() {
        // Create new Scanner object for reading input
        Scanner in = new Scanner(System.in);

        // Prompting for radius and calculates area
        System.out.print("What is the circle's radius? ");
        double radius = in.nextDouble();

        double area = Math.PI * radius * radius;
        return area;
    }

    /**
     * Prompts user for length and width, returning the area of a rectangle.
     * @return area of a rectangle
     */
    public static double rectangle() {
        // Create new Scanner object for reading input
        Scanner in = new Scanner(System.in);

        // Prompting for length and width, then calculates area
        System.out.print("What is the rectangle's length? ");
        double length = in.nextDouble();

        System.out.print("What is the rectangle's width? ");
        double width = in.nextDouble();

        double area = length * width;
        return area;
    }

    /**
     * Prompts user for base and height, returning the area of a triangle.
     * @return area of a triangle
     */
    public static double triangle() {
        // Create new Scanner object for reading input
        Scanner in = new Scanner(System.in);

        // Prompting for base and height, then calculates area
        System.out.print("What is the triangle's base? ");
        double base = in.nextDouble();

        System.out.print("What is the triangle's height? ");
        double height = in.nextDouble();

        double area = 0.5 * base * height;
        return area;
    }
}