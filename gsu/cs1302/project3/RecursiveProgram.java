/**
 * Implementing a recursive Square Root algorithm
 *
 * @author Fahim Jeylani-Tran
 * @version 7/12/20
 */
public class RecursiveProgram {

    /**
     * Main method for testing Square Root methods
     * @param args command line arguments (not used for this project)
     */
    public static void main(String[] args) {
        // Test Variable
        double test = 625;

        // Spacing for command line
        System.out.println();

        // Displays original number and compares square root and its approximation
        System.out.println("Original Number:                " + test);
        System.out.println("Approx. Square Root:            " + squareRoot(test));
        System.out.println("Square Root using Math.sqrt() : " + Math.sqrt(test));
    }

    /**
     * Square Root method that calls squareRootGuess(double x, duoble g) helper method
     * @param x the number to be square rooted
     * @return the approximate square root +/- 0.001
     */
    public static double squareRoot(double x) {
        // Condition for the Greek algorithm
        if (x > 0) {
            // User doesn't initially guess; it divides by 2 to get a smaller number
            double initialGuess = x / 2.0;
            return squareRootGuess(x, initialGuess);
        } else {
            // Error Handling
            System.out.println("Invalid input.");
            return 0;
        }
    }

    /**
     * Recursive helper method to find square root approximation
     * @param x the number to be square rooted
     * @param g a number that's guessing the square root of x
     * @return the square root approximation of x +/- 0.001
     */
    public static double squareRootGuess(double x, double g) {
        // Difference for approximation
        double approximateDifference = ((g * g) - x);

        // Recursive algorithm for false branch, otherwise returns g as a good guess
        if (approximateDifference < 0.001 && approximateDifference > -0.001) {
            return g;
        } else {
            g = (g + x / g) / 2;
            return squareRootGuess(x, g);
        }
    }
}