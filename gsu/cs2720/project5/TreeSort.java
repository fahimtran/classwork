import java.util.Random;
import java.util.Scanner;

/**
 * Implementing Tree Sort.
 * 
 * @author Fahim Jeylani-Tran
 * @version 11/12/20
 */
public class TreeSort {
    // Declaring static variables to be used in methods
    static final int NUMBER_OF_INTEGERS = 50000;
    static int[] intArray = new int[NUMBER_OF_INTEGERS];
    static BST<Integer> integerTree;

    // Runs program - Testing tree sort
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Looping through userInput
        boolean isDone = false;
        while (!isDone) {
            System.out.println("\nDo you want to randomize and tree sort " + NUMBER_OF_INTEGERS + " integers? ");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            int numberInput = keyboard.nextInt();
            switch (numberInput) {
                case 1:
                    randomizeAndSortIntegers();
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
    public static void randomizeAndSortIntegers() {
        // Using Random to randomize values in an int array
        Random seed = new Random();
        intArray = new int[NUMBER_OF_INTEGERS];
        for (int i = 0; i < NUMBER_OF_INTEGERS; i++) {
            intArray[i] = seed.nextInt();
        }

        integerTree = new BST<>();

        // Time Tree Sort
        long startTime = System.nanoTime();

        // Converting ints to Integers and storing them in tree
        for (int i = 0; i < NUMBER_OF_INTEGERS; i++) {
            integerTree.insert(intArray[i]);
        }

        long endTime = System.nanoTime();
        long treeSortDuration = (endTime - startTime) / 1000000;

        System.out.println("\nTree Sort Time: " + treeSortDuration + " milliseconds.");

        // integerTree.inOrderPrint();
    }

}

class BST<T extends Comparable<T>> {
    private Node<T> root;

    public BST() {
        root = null;
    }

    // Starter method for insertion
    public void insert(T item) {
        root = insertHelper(root, item);
    }

    /**
     * Helps recursively insert nodes
     * 
     * @param parent parent node
     * @param item   item to be inserted
     * @return parent node after finishing recursion
     */
    private Node<T> insertHelper(Node<T> parent, T item) {
        if (parent == null) {
            parent = new Node<>(item);
            return parent;
        }

        if (item.compareTo(parent.value) == 0) {
            System.out.println("Duplicate: " + item.toString());
        } else if (item.compareTo(parent.value) < 0) {
            parent.left = insertHelper(parent.left, item);
        } else {
            parent.right = insertHelper(parent.right, item);
        }

        return parent;
    }

    // Starter method - Prints In Order
    public void inOrderPrint() {
        inOrderPrintHelper(root);
    }

    /**
     * Recursive helper to print tree
     * 
     * @param root root of tree
     */
    private void inOrderPrintHelper(Node<T> root) {
        if (root != null) {
            inOrderPrintHelper(root.left);
            System.out.print(root.value + " ");
            inOrderPrintHelper(root.right);
        }
    }

    // Inner Node class
    class Node<T extends Comparable<T>> {
        T value;
        Node<T> left, right;

        public Node(T item) {
            value = item;
            left = null;
            right = null;
        }
    }
}

/**
 * Output **
 * 
 * 
 * 
 * Do you want to randomize and tree sort 50000 integers? 1 - Yes 2 - No 1
 * 
 * Tree Sort Time: 19 milliseconds.
 * 
 * Do you want to randomize and tree sort 50000 integers? 1 - Yes 2 - No 1
 * 
 * Tree Sort Time: 12 milliseconds.
 * 
 * Do you want to randomize and tree sort 50000 integers? 1 - Yes 2 - No 1
 * 
 * Tree Sort Time: 10 milliseconds.
 * 
 * Do you want to randomize and tree sort 50000 integers? 1 - Yes 2 - No 1
 * 
 * Tree Sort Time: 10 milliseconds.
 * 
 * Do you want to randomize and tree sort 50000 integers? 1 - Yes 2 - No 1
 * 
 * Tree Sort Time: 11 milliseconds.
 * 
 * Do you want to randomize and tree sort 50000 integers? 1 - Yes 2 - No 2
 * Exiting program...
 * 
 * 
 */