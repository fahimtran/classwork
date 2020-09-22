import java.util.Scanner;

/**
 * Implementing a class testing Deque Array
 *
 * @author Fahim Jeylani-Tran
 * @version 9/21/20
 */
public class DequeArrayTest {

    /**
     * Main method for testing Deque Array
     * 
     * @param args command line arguments (not used for this project)
     */
    public static void main(String[] args) {
        // Initialization of Scanner and Deque with Modifiable entries.
        Scanner keyboard = new Scanner(System.in);
        DequeArray<String> deque = new DequeArray<>();
        int frontEntries = 3;
        int backEntries = 3;

        // Introduction and Insertion
        System.out.println("Welcome to the Deque Array program!");
        System.out.println("Please enter " + frontEntries + " strings in the front of the deque:");
        for (int i = 0; i < frontEntries; i++) {
            System.out.print("String " + (i + 1) + ": ");
            deque.addToFront(keyboard.nextLine());
        }
        System.out.println();

        System.out.println("Please enter " + backEntries + " strings in the back of the deque:");
        for (int i = 0; i < backEntries; i++) {
            System.out.print("String " + (i + 1) + ": ");
            deque.addToBack(keyboard.nextLine());
        }
        System.out.println();

        // Removal from front then back
        System.out.println("Removing 2 strings from the front of the deque: ");
        System.out.println("Front Removed 1: " + deque.removeFront());
        System.out.println("Front Removed 2: " + deque.removeFront());
        System.out.println();

        System.out.println("Removing 2 strings from the back of the deque: ");
        System.out.println("Back Removed 1: " + deque.removeBack());
        System.out.println("Back Removed 2: " + deque.removeBack());
        System.out.println();

        // Display Current Front and Current Back
        System.out.println("Current front of the deque: " + deque.getFront());
        System.out.println("Current back of the deque: " + deque.getBack());
        System.out.println();

        // End of Program Display
        keyboard.close();
        System.out.println("Exited program successfully.");
    }

}

/**
 * A class that implements DequeInterface<T> in a Array-based way.
 */
class DequeArray<T> implements DequeInterface<T> {
    // Fields taken from book and personal needs for validation
    private T[] deque;
    private int frontIndex;
    private int backIndex;
    private int size;
    private boolean initialized;
    private static final int DEFAULT_CAPACITY = 50;
    private static final int MAX_CAPACITY = 10000;

    /**
     * Default Constructor
     */
    public DequeArray() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Takes in an initial capacity and initializes a genericized array of that
     * type.
     * 
     * @param initialCapacity
     */
    public DequeArray(int initialCapacity) {
        checkCapacity(initialCapacity);

        @SuppressWarnings("unchecked")
        T[] tempDeque = (T[]) new Object[initialCapacity + 1];
        deque = tempDeque;
        frontIndex = -1;
        backIndex = 0;
        size = initialCapacity;
        initialized = true;
    }

    /**
     * Adds newEntry to the front of the deque.
     * 
     * @param newEntry
     */
    public void addToFront(T newEntry) {
        checkInitialization();
        if (isFull()) {
            ensureCapacity();
        }

        if (frontIndex == -1) {
            frontIndex = 0;
            backIndex = 0;
        } else if (frontIndex == 0) {
            frontIndex = size - 1;
        } else {
            frontIndex = frontIndex - 1;
        }

        deque[frontIndex] = newEntry;
    }

    /**
     * Adds newEntry to the back of the deque.
     * 
     * @param newEntry
     */
    public void addToBack(T newEntry) {
        checkInitialization();
        if (isFull()) {
            ensureCapacity();
        }

        if (frontIndex == -1) {
            frontIndex = 0;
            backIndex = 0;
        } else if (backIndex == size - 1) {
            backIndex = 0;
        } else {
            backIndex = backIndex + 1;
        }

        deque[backIndex] = newEntry;
    }

    /**
     * Removes and returns the item in the front of the deque.
     * 
     * @return Item from the front of the deque
     */
    public T removeFront() {
        checkInitialization();
        if (isEmpty()) {
            System.out.println("Cannot remove from empty Deque.");
            return null;
        }

        T removedObject;
        removedObject = deque[frontIndex];
        if (frontIndex == backIndex) {
            frontIndex = -1;
            backIndex = -1;
        } else {
            if (frontIndex == size - 1) {
                frontIndex = 0;
            } else {
                frontIndex = frontIndex + 1;
            }
        }
        return removedObject;
    }

    /**
     * Removes and returns the item in the back of the deque.
     * 
     * @return Item from the back of the deque
     */
    public T removeBack() {
        checkInitialization();
        if (isEmpty()) {
            System.out.println("Cannot remove from empty Deque.");
            return null;
        }

        T removedObject;
        removedObject = deque[backIndex];
        if (frontIndex == backIndex) {
            frontIndex = -1;
            backIndex = -1;
        } else if (backIndex == 0) {
            backIndex = size - 1;
        } else {
            backIndex = backIndex - 1;
        }
        return removedObject;
    }

    /**
     * Returns, but doesn't modify, the item in the front of the deque.
     * 
     * @return Item in the front of the deque.
     */
    public T getFront() {
        checkInitialization();
        if (isEmpty() || frontIndex > size) {
            System.out.println("Cannot retrieve from empty Deque.");
            return null;
        }

        T frontObject;
        frontObject = deque[frontIndex];
        return frontObject;
    }

    /**
     * Returns, but doesn't modify, the item in the back of the deque.
     * 
     * @return Item in the back of the deque.
     */
    public T getBack() {
        checkInitialization();
        if (isEmpty() || backIndex < 0) {
            System.out.println("Cannot retrieve from empty Deque.");
            return null;
        }

        T backObject;
        backObject = deque[backIndex];
        return backObject;
    }

    /**
     * Returns a check for if the deque is full.
     * 
     * @return True if deque is full, false otherwise.
     */
    public boolean isFull() {
        return ((frontIndex == 0 && backIndex == size - 1) || frontIndex == backIndex + 1);
    }

    /**
     * Returns a check for if the deque is empty.
     * 
     * @return True if deque is empty, false otherwise.
     */
    public boolean isEmpty() {
        return (frontIndex == -1);
    }

    /** Clears deque. */
    public void clear() {
        checkInitialization();
        if (!isEmpty()) { // deallocates only the used portion
            for (int index = frontIndex; index != backIndex; index = (index + 1) % deque.length) {
                deque[index] = null;
            }

            deque[backIndex] = null;
        }

        frontIndex = 0;
        backIndex = deque.length - 1;
        size = 0;
    }

    /** Increases size of deque when needed. */
    private void ensureCapacity() {
        if (frontIndex == ((backIndex + 2) % deque.length)) // If array is full,
        { // double size of array
            T[] oldDeque = deque;
            int oldSize = oldDeque.length;
            int newSize = 2 * oldSize;
            checkCapacity(newSize);

            // The cast is safe because the new array contains null entries
            @SuppressWarnings("unchecked")
            T[] tempQueue = (T[]) new Object[newSize];
            deque = tempQueue;
            for (int index = 0; index < oldSize - 1; index++) {
                deque[index] = oldDeque[frontIndex];
                frontIndex = (frontIndex + 1) % oldSize;
            }

            frontIndex = 0;
            backIndex = oldSize - 2;
        }
    }

    /**
     * Checks deque capacity to ensure no logic errors occur.
     * 
     * @param capacity
     */
    private void checkCapacity(int capacity) {
        if (capacity > MAX_CAPACITY) {
            throw new IllegalStateException(
                    "Attempt to create a queue " + "whose capacity exceeds " + "allowed maximum.");
        }
    }

    /** Checks if deque is initialized. */
    private void checkInitialization() {
        if (!initialized) {
            throw new SecurityException("ArrayQueue object is not initialized properly.");
        }
    }
}

/**
 * An interface for the ADT deque.
 */
interface DequeInterface<T> {

    /**
     * Adds a new entry to the front/back of this deque.
     * 
     * @param newEntry An object to be added.
     */
    public void addToFront(T newEntry);

    public void addToBack(T newEntry);

    /**
     * Removes and returns the front/back entry of this deque.
     * 
     * @return The object at the front/back of the deque.
     */
    public T removeFront();

    public T removeBack();

    /**
     * Retrieves the front/back entry of this deque.
     * 
     * @return The object at the front/back of the deque.
     */
    public T getFront();

    public T getBack();

    /**
     * Detects whether this deque is empty.
     * 
     * @return True if the deque is empty, or false otherwise.
     */
    public boolean isEmpty();

    /**
     * Removes all entries from this deque.
     * 
     */
    public void clear();

}

/**
PS C:\Users\fahim\Desktop\projects\classwork\gsu\cs2720\project2> javac DequeArrayTest.java
PS C:\Users\fahim\Desktop\projects\classwork\gsu\cs2720\project2> java DequeArrayTest      
Welcome to the Deque Array program!
Please enter 3 strings in the front of the deque:
String 1: a
String 2: b
String 3: c

Please enter 3 strings in the back of the deque:
String 1: d
String 2: e
String 3: f

Removing 2 strings from the front of the deque:
Front Removed 1: c
Front Removed 2: b

Removing 2 strings from the back of the deque:
Back Removed 1: f
Back Removed 2: e

Current front of the deque: a
Current back of the deque: d

Exited program successfully.
PS C:\Users\fahim\Desktop\projects\classwork\gsu\cs2720\project2> 
 */

/**
Deque details:
Items inserted at front: a, b, c
Items inserted at back: d, e, f
Resulting deque: [f, e, d, a, b, c]
 */