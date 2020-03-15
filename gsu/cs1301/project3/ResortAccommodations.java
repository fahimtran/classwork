import java.util.Scanner;

/*
 * Calculates Room Occupancy Statistics for a Resort (Hotel). 
 *
 * @author Fahim Jeylani-Tran
 * @version 3/16/2020
 */
public class ResortAccommodations {
    public static void main(String[] args) {
        // Declaring Variables and Objects
        Scanner in = new Scanner(System.in);
        int totalRooms = 0;
        int totalOccupied = 0;

        // Prompt User for the amount of Floors
        int noOfFloors = 0;
        System.out.print("How many floors does the resort have? ");
        noOfFloors = in.nextInt();

        // Validation
        while (noOfFloors < 1) {
            System.out.print("Invalid. Enter 1 or more: ");
            noOfFloors = in.nextInt();
        }

        // Loop through floors to attain totalRooms & occupiedRooms
        int rooms = 0;
        int occupied = 0;
        for (int i = 1; i <= noOfFloors; i++) {
            // Prompts for current floor's room count and validates it
            System.out.print("How many rooms does floor " + i + " have? ");
            rooms = in.nextInt();
            while (rooms < 10) {
                System.out.print("Invalid. Enter 10 or more: ");
                rooms = in.nextInt();
            }

            // Prompts for current floor's occupancy count and validates it
            System.out.print("How many occupied rooms does floor " + i + " have? ");
            occupied = in.nextInt();
            while (occupied > rooms) {
                System.out.print("Invalid. Enter a number between 1 and " + rooms + ": ");
                occupied = in.nextInt();
            }

            // Adds rooms to totalRooms and occupied to totalOccupied
            totalRooms += rooms;
            totalOccupied += occupied;

            // Reset rooms and occupied
            rooms = 0;
            occupied = 0;
        }

        // Calculations
        int vacantRooms = totalRooms - totalOccupied;
        double percentOccupancy = ((double) totalOccupied / totalRooms) * 100.0;

        // Printing Output
        System.out.printf("%nNumber of rooms: %d%n", totalRooms);
        System.out.printf("Occupied rooms: %d%n", totalOccupied);
        System.out.printf("Vacant rooms: %d%n", vacantRooms);
        System.out.printf("Occupancy rate: %.2f%%%n", percentOccupancy);
    }
}