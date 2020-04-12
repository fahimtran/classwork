import java.util.Scanner;
import java.util.Arrays;

/**
 * An application that plays a Lottery Game.
 *
 * @author Fahim Jeylani-Tran
 * @version 4/12/2020
 */
public class LotteryGame {
    // Global number of Digits used in the Lottery Game
    static final int NUM_DIGITS = 5;

    public static void main(String[] args) {
        // Abstracted implementation to called methods
        greetUser();
        int[] lotteryNumbers = getLotteryNumbers();
        int[] userPicks = getUserPicks();
        int matches = findMatches(lotteryNumbers, userPicks);

        System.out.print("\nLottery Numbers: ");
        for (int number : lotteryNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Number of matching digits: " + matches);
        if (matches == 5) {
            System.out.println("GRAND PRIZE WINNER!!");
        } else {
            System.out.println("Sorry, you didn't win.");
        }
    }

    /**
     * Greets the User.
     */
    public static void greetUser() {
        System.out.println("        Welcome to the Lottery Game        ");
        System.out.println("You will pick 5 numbers (0 - 9) and we will");
        System.out.println("see if you are the Grand Prize Winner!     ");
        System.out.println();
    }

    /**
     * Produces a set of Lottery Numbers.
     * @return an integer array of lottery numbers
     */
    public static int[] getLotteryNumbers() {
        // Initializing variables
        Scanner in = new Scanner(System.in);
        int[] lotteryNumbers = new int[NUM_DIGITS];

        // For loop to assign random numbers
        for (int i = 0; i < lotteryNumbers.length; i++) {
            // Will produce ints [0, 10), excluding ten so effectively [0, 9]
            lotteryNumbers[i] = (int) (Math.random() * (10));
        }
        return lotteryNumbers;
    }

    /**
     * Prompts and receives user picks.
     * @return an integer array of user picks/guesses
     */
    public static int[] getUserPicks() {
        // Initializing variables
        Scanner in = new Scanner(System.in);
        int[] userPicks = new int[NUM_DIGITS];

        // For loop to prompt for user numbers
        for (int i = 0; i < userPicks.length; i++) {
            System.out.print("Enter pick " + (i + 1) + " (0 - 9): ");
            userPicks[i] = in.nextInt();
            while (userPicks[i]< 0 || userPicks[i] > 9) {
                System.out.print("ERROR. Please enter a number (0 - 9): ");
                userPicks[i] = in.nextInt();
            }
        }
        return userPicks;
    }

    /**
     * Prompts and receives user picks.
     * @param lotteryNumbers integer array of lottery numbers
     * @param userPicks integer array of user guesses
     * @return a count of matching elements between lotteryNumbers and userPicks
     */
    public static int findMatches(int[] lotteryNumbers, int[] userPicks) {
        // Initialize variables
        int count = 0;

        /**
         * The boolean[] positionCheck helps check for duplicates as a paired array to userPicks.
         * Suppose you have random lottery numbers {0, 2, 2, 2, 8}.
         * Supposed you have guesses {2, 3, 6, 1, 9}.
         *
         * Without an additional check for the position (or duplicates),
         * the given algorithm produces 3 matches; the existing matches aren't checked.
         *
         * positionCheck will flag if the number has been matched and will aid in finding matches.
         */
        boolean[] positionCheck = new boolean[NUM_DIGITS];

        // Two loops to check each element that are indexically invariant to one another
        for (int i = 0; i < NUM_DIGITS; i++) {
            for (int j = 0; j < NUM_DIGITS; j++) {
                if (lotteryNumbers[i] == userPicks[j] && (positionCheck[j] == false)) {
                    positionCheck[j] = true;
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}