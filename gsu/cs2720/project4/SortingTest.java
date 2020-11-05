import java.util.Random;
import java.util.Scanner;
/**
 * Comparing Selection Sort and Quick Sort.
 * 
 * @author Fahim Jeylani-Tran
 * @version 11/2/20
 */
public class SortingTest {
    // Declaring static variables to be used in methods
    final static int NUMBER_OF_INTEGERS = 50000;
    final static int MIN_SIZE = 4;
    static int[] intArray = new int[NUMBER_OF_INTEGERS];
    static Integer[] selectionArray = new Integer[NUMBER_OF_INTEGERS];
    static Integer[] quickArray = new Integer[NUMBER_OF_INTEGERS];

    // Runs program - Comparing Selection Sort and Quick Sort
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Looping through userInput
        boolean isDone = false;
        while (!isDone) {
            System.out.println("\nDo you want to randomize and sort 50,000 integers? ");
            System.out.println("1 - Yes (Times for Selection Sort and Quick Sort will be displayed)");
            System.out.println("2 - No (Will exit the program)");
            int numberInput = keyboard.nextInt();
            switch (numberInput) {
                case 1:
                    randomizeIntegers();
                    timeMethods();
                    break;
                case 2:
                    isDone = true;
                    break;
                default:
                    System.out.println("Invalid input - Try again!");
                    break;
            }
        }

        System.out.println("Exiting program...");
    }

    // Generate 50,000 Random Integers
    public static void randomizeIntegers() {
        // Using Random to randomize values in an int array
        Random seed = new Random();
        intArray = new int[NUMBER_OF_INTEGERS];
        for (int i = 0; i < NUMBER_OF_INTEGERS; i++) {
            intArray[i] = seed.nextInt();
        }

        // Converting ints to Integers
        selectionArray = new Integer[NUMBER_OF_INTEGERS];
        quickArray = new Integer[NUMBER_OF_INTEGERS];
        for (int i = 0; i < NUMBER_OF_INTEGERS; i++) {
            selectionArray[i] = intArray[i];
            quickArray[i] = intArray[i];
        }
    }

    // Timing method
    public static void timeMethods() {
        // Time Selection Sort
        long startTime = System.nanoTime();
        selectionSort(selectionArray, NUMBER_OF_INTEGERS);
        long endTime = System.nanoTime();
        long selectionDuration = (endTime - startTime) / 1000000;

        // Time Quick Sort
        startTime = System.nanoTime();
        quickSort(quickArray, 0, NUMBER_OF_INTEGERS - 1);
        endTime = System.nanoTime();
        long quickDuration = (endTime - startTime) / 1000000;

        // Display Times
        System.out.println("\nSelection Sort Time: " + selectionDuration + " milliseconds.");
        System.out.println("Quick Sort Time: " + quickDuration + " milliseconds.");
    }

    /**
     * Selection Sort method
     * @param <T> Comparable Interface Generic
     * @param a Generic Array of type Comparable Interface
     * @param n Size of a[]
     */
    public static <T extends Comparable<? super T>> void selectionSort(T[] a, int n) {
        for (int index = 0; index < n - 1; index++) {
            int indexOfNextSmallest = getIndexOfSmallest(a, index, n - 1);
            swap(a, index, indexOfNextSmallest);
        }
    }

    /**
     * Gets index of smallest value within first and last indices
     * @param <T> Comparable Interface Generic
     * @param a Generic Array of type Comparable Interface
     * @param first first index
     * @param last last index
     * @return index of smallest 
     */
    private static <T extends Comparable<? super T>> int getIndexOfSmallest(T[] a, int first, int last) {
        T min = a[first];
        int indexOfMin = first;
        for (int index = first + 1; index <= last; index++) {
            if (a[index].compareTo(min) < 0) {
                min = a[index];
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }

    /**
     * Swaps objects at i and j in array a
     * @param a Array of Objects
     * @param i index i
     * @param j index j
     */
    private static void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    /**
     * Quick Sort method
     * @param a Generic Array of type Comparable Interface
     * @param left Left index
     * @param right Right index
     */
    public static <T extends Comparable<? super T>> void quickSort(T[] a, int first, int last) 
    { 
        if (last - first + 1 < MIN_SIZE) {
            sortIndices(a, first, last);
        } else {
            int pivotIndex = partition(a, first, last);
            quickSort(a, first, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, last);
        }
    }

    /**
     * Sorts between indices
     * @param <T> Comparable Interface Generic
     * @param a Generic Array of type Comparable Interface
     * @param first first index
     * @param last last index
     */
    private static <T extends Comparable<? super T>> void sortIndices(T[] a, int first, int last) {
        for (int i = 0; i <= (last - first); i++) {
            for (int j = first; j < last; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    /**
     * Partitions array and returns a pivot index
     * @param <T> Comparable Interface Generic
     * @param a Generic Array of type Comparable Interface
     * @param first first index
     * @param last last index
     * @return pivot index
     */
    private static <T extends Comparable<? super T>> int partition(T[] a, int first, int last) {
        T pivot = a[(last - first) / 2];
        int i = first - 1;
        for (int j = first; j < last; j++) {
            if (a[j].compareTo(pivot) < 0) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, (last - first) / 2);

        return i + 1;
    }
}

/**
 * Output **
 * 
 * Do you want to randomize and sort 50,000 integers?
 * 1 - Yes (Times for Selection Sort and Quick Sort will be Displayed)
 * 2 - No (Will exit the program)
 * 1
 * 
 * Selection Sort Time: 2067 milliseconds.
 * Quick Sort Time: 27 milliseconds.
 * 
 * Do you want to randomize and sort 50,000 integers?
 * 1 - Yes (Times for Selection Sort and Quick Sort will be Displayed)
 * 2 - No (Will exit the program)
 * 1
 * 
 * Selection Sort Time: 2035 milliseconds.
 * Quick Sort Time: 9 milliseconds.
 * 
 * Do you want to randomize and sort 50,000 integers?
 * 1 - Yes (Times for Selection Sort and Quick Sort will be Displayed)
 * 2 - No (Will exit the program)
 * 2
 * Exiting program...
 * 
 * 
 */