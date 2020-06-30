/**
 * Implementing a Car class to create Car objects and test them
 *
 * @author Fahim Jeylani-Tran
 * @version 6/29/20
 */
public class Car {

    /**
     * Main method for testing Car objects
     * @param args command line arguments (not used for this project)
     */
    public static void main(String[] args) {
        // Sample Usage
        Car myHybrid = new Car(50); // 50 miles per gallon
        myHybrid.addGas(20); // Tank 20 gallons
        myHybrid.drive(100); // Drive 100 miles
        System.out.println("Gas Level: " + myHybrid.getGasLevel()); // Print fuel remaining
        System.out.println("Expected : 18.0\n"); // Expected fuel remaining

        // My Tests - testing Accessors and Mutators as well as other methods
        Car myCar = new Car(); // Default 15 miles per gallon
        System.out.println("Fuel Efficiency: " + myCar.getFuelEfficiency());
        System.out.println("Expected : 15.0\n");
        
        myCar.setFuelEfficiency(31.5); // Storing double for fuelEfficiency
        System.out.println("Fuel Efficiency: " + myCar.getFuelEfficiency());
        System.out.println("Expected : 31.5\n");

        myCar.setGasLevel(15.7); // Storing double for gasLevel
        System.out.println("Gas Level: " + myCar.getGasLevel());
        System.out.println("Expected : 15.7\n");

        myCar.drive(150); // Drive 150 miles
        System.out.println("Gas Level: " + myCar.getGasLevel());
        System.out.println("Expected : 10.93809524\n");
    }

    // Instance fields, doubles are used since decimals are used in industry
    private double fuelEfficiency;
    private double gasLevel;

    /**
     * Default constructor for Car object
     */
    public Car() {
        System.out.println("Setting default fuel efficiency to 15 miles per gallon.");
        fuelEfficiency = 15.0;
        gasLevel = 0;
    }

    /**
     * Custom constructor that takes in an inputted fuel efficiency value
     * @param newFuelEfficiency a new fuel efficiency value to create a new Car with
     */
    public Car(double newFuelEfficiency) {
        fuelEfficiency = newFuelEfficiency;
        gasLevel = 0;
    }

    /**
     * Mutator method for fuelEfficiency
     * @param newFuelEfficiency new fuel efficiency value
     */
    public void setFuelEfficiency(double newFuelEfficiency) {
        fuelEfficiency = newFuelEfficiency;
    }

    /**
     * Accessor method for fuelEfficiency
     * @return fuelEfficiency as double 
     */
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    /**
     * Mutator method for gasLevel
     * @param newGasLevel new value for gasLevel (not the same as adding gas)
     */
    public void setGasLevel(double newGasLevel) {
        gasLevel = newGasLevel;
    }

    /**
     * Accessor method for gasLevel
     * @return gasLevel as double
     */
    public double getGasLevel() {
        return gasLevel;
    }

    /**
     * Custom method for adding gas to existing gasLevel
     * @param gasAmount inputted amount of gas to add to gasLevel
     */
    public void addGas(double gasAmount) {
        gasLevel += gasAmount;
    }

    /**
     * Custom method for simulate a car driving a set amount of miles
     * @param miles amount of miles to be driven
     */
    public void drive(double miles) {
        double newGasLevel = ((fuelEfficiency * gasLevel) - miles) / fuelEfficiency;
        gasLevel = newGasLevel;
    }
}