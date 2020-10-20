/**
 * Implementing a class testing LList, a different implementation of LinkedList.
 * 
 * @author Fahim Jeylani-Tran
 * @version 10/15/20
 */
public class LinkedList {
    public static void main(String[] args) {
        System.out.println("Create an empty list.");
        LList<String> myList = new LList<>();
        System.out.println("List should be empty; isEmpty returns " + myList.isEmpty() + ".");

        System.out.println("\nTesting add to end.");
        myList.add("15");
        myList.add("25");
        myList.add("35");
        myList.add("45");

        System.out.println("List should contain 15 25 35 45.");
        myList.printList();

        System.out.println("\nTesting add at position 1. Adding 10.");
        myList.add(1, "10");
        myList.printList();

        System.out.println("\nTesting remove at position 3. Should remove 25.");
        myList.remove(3);
        myList.printList();

        System.out.println("\nTesting contains. Checking for 25. Should return false.");
        System.out.println("List contains 25? " + myList.contains("25"));
        myList.printList();

        Object[] objectArray = myList.toArray();
        System.out.println("\nTesting toArray. New Array Hash: " + objectArray);
        System.out.println("\nTesting enhanced for-loop print on new Array.");
        for (Object entry : objectArray) {
            System.out.print(entry + " ");
        }

        System.out.println("\n\nList should not be empty; isEmpty returns " + myList.isEmpty() + ".");

        myList.clear();
        System.out.println("\nList should be empty; isEmpty returns " + myList.isEmpty() + ".");

    }
}

/**
 * A linked implementation of the ADT list.
 */
final class LList<T> implements ListInterface<T> {
    private Node firstNode; // Reference to the first node of chain
    private int numberOfEntries;

    public LList() {
        initializeDataFields();
    } // end default constructor

    /**
     * Adds a new entry to this List.
     * 
     * @param newEntry The object to be added as a new entry.
     */
    public void add(T newEntry) {
        Node newNode = new Node(newEntry);
        if (isEmpty()) {
            firstNode = newNode;
        } else {
            Node lastNode = getNodeAt(numberOfEntries);
            lastNode.setNextNode(newNode);
        }
        numberOfEntries++;
    } // end add

    /**
     * Adds a new entry at the specified in this List.
     * 
     * @param givenPosition Adds newEntry at position newPosition
     * @param newEntry      The object to be added as a new entry.
     */
    public void add(int givenPosition, T newEntry) {
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries + 1)) {
            Node newNode = new Node(newEntry);
            if (givenPosition == 1) {
                newNode.setNextNode(firstNode);
                firstNode = newNode;
            } else {
                Node nodeBefore = getNodeAt(givenPosition - 1);
                Node nodeAfter = nodeBefore.getNextNode();
                newNode.setNextNode(nodeAfter);
                nodeBefore.setNextNode(newNode);
            } // end if
            numberOfEntries++;
        } else {
            throw new IndexOutOfBoundsException("Illegal position given to add operation.");
        }
    }

    /**
     * Removes one occurence of a given entry from this List, if possible.
     * 
     * @param givenPosition
     * @return Either the removed entry, if the removal was successful, or null
     */
    public T remove(int givenPosition) {
        T removedEntry = null;

        if (!isEmpty() && givenPosition >= 1 && givenPosition <= numberOfEntries) {
            removedEntry = getEntry(givenPosition);
            if (numberOfEntries == 1) {
                clear();
            } else {
                if (givenPosition == numberOfEntries) {
                    Node beforeNode = getNodeAt(givenPosition - 1);
                    beforeNode.setNextNode(null);
                } else {
                    Node beforeNode = getNodeAt(givenPosition - 1);
                    beforeNode.setNextNode(beforeNode.getNextNode().getNextNode());
                }
            }
            numberOfEntries--;
        }

        return removedEntry;
    }

    /**
     * Retrieves the entry at position givenPosition.
     *
     * @param givenPosition
     * @return The object at the given position.
     */
    public T getEntry(int givenPosition) {
        return getNodeAt(givenPosition).getData();
    }

    /** Removes all entries from this List. */
    public void clear() {
        initializeDataFields();
    }

    /**
     * Replaces the entry at position givenPosition.
     *
     * @param givenPosition An integer position.
     * @param newEntry      An object.
     * @return The replaced entry.
     */
    public T replace(int givenPosition, T newEntry) {
        T replacedEntry = getEntry(givenPosition);
        getNodeAt(givenPosition).setData(newEntry);
        return replacedEntry;
    }

    /**
     * Retrieves all entries that are in this List
     * 
     * @return A newly allocated array of all the entries in the List. Note: If the
     *         List is empty, the returned array is empty.
     */
    public T[] toArray() {
        // The cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];
        int index = 0;
        Node currentNode = firstNode;
        while (currentNode != null && index < numberOfEntries) {
            result[index] = currentNode.getData();
            currentNode = currentNode.getNextNode();
            index++;
        } // end while
        return result;
    }

    /**
     * Tests whether this List contains a given entry.
     * 
     * @param anEntry The entry to find.
     * @return True if the List contains anEntry, or false if not.
     */
    public boolean contains(T anEntry) {
        boolean result = false;
        for (int i = 0; i < numberOfEntries; i++) {
            if (getEntry(i + 1).equals(anEntry)) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Gets the current number of entries in this List
     * 
     * @return The integer number of entries currently in the List.
     */
    public int getLength() {
        return numberOfEntries;
    }

    /**
     * Sees whether this List is empty.
     * 
     * @return True if the List is empty, or false if not.
     */
    public boolean isEmpty() {
        boolean result;
        if (numberOfEntries == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /** Prints the content of the List. */
    public void printList() {
        for (int i = 0; i < numberOfEntries; i++) {
            System.out.print(getNodeAt(i + 1).getData().toString() + " ");
        }
        System.out.println();
    }

    /**
     * Initializes the class's data fields to indicate an empty list.
     */
    private void initializeDataFields() {
        // IMPORTANT DUMMY NODE INITIALIZATION
        firstNode = new Node();
        numberOfEntries = 0;
    }

    /**
     * Returns a reference to the node at the given position.
     */
    private Node getNodeAt(int givenPosition) {
        Node currentNode = firstNode;
        for (int counter = 1; counter < givenPosition; counter++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }

    private class Node {
        private T data; // Entry in List
        private Node next; // Link to next node

        private Node() {

        }

        private Node(T dataPortion) {
            this(dataPortion, null);
        }

        private Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        }

        private T getData() {
            return data;
        }

        private void setData(T newData) {
            data = newData;
        }

        private Node getNextNode() {
            return next;
        }

        private void setNextNode(Node nextNode) {
            next = nextNode;
        }
    } // end Node
}

/**
 * An interface that describes the operations of a List of objectts
 * 
 * @author Frank M. Carrano, Timothy M. Henry
 */
interface ListInterface<T> {

    /**
     * Adds a new entry to this List.
     * 
     * @param newEntry The object to be added as a new entry.
     */
    public void add(T newEntry);

    /**
     * Adds a new entry to this List.
     * 
     * @param givenPosition Adds newEntry at position newPosition
     * @param newEntry      The object to be added as a new entry.
     */
    public void add(int givenPosition, T newEntry);

    /**
     * Removes one unspecified entry from this List, if possible.
     * 
     * @return Either the removed entry, if the removal was successful, or null
     */
    public T remove(int givenPosition);

    /** Removes all entries from this List. */
    public void clear();

    /**
     * Replaces the entry at position givenPosition.
     *
     * @param givenPosition An integer position.
     * @param newEntry      An object.
     * @return The replaced entry.
     */
    public T replace(int givenPosition, T newEntry);

    /**
     * Retrieves the entry at position givenPosition.
     *
     * @param givenPosition
     * @return The object at the given position.
     */
    public T getEntry(int givenPosition);

    /**
     * Retrieves all entries that are in this List
     * 
     * @return A newly allocated array of all the entries in the List. Note: If the
     *         List is empty, the returned array is empty.
     */
    public T[] toArray();

    /**
     * Tests whether this List contains a given entry.
     * 
     * @param anEntry The entry to find.
     * @return True if the List contains anEntry, or false if not.
     */
    public boolean contains(T anEntry);

    /**
     * Gets the current number of entries in this List
     * 
     * @return The integer number of entries currently in the List.
     */
    public int getLength();

    /**
     * Sees whether this List is empty.
     * 
     * @return True if the List is empty, or false if not.
     */
    public boolean isEmpty();

}

/**
 * Output
 * 
 * Create an empty list. List should be empty; isEmpty returns true.
 * 
 * Testing add to end. List should contain 15 25 35 45. 15 25 35 45
 * 
 * Testing add at position 1. Adding 10. 10 15 25 35 45
 * 
 * Testing remove at position 3. Should remove 25. 10 15 35 45
 * 
 * Testing contains. Checking for 25. Should return false. List contains 25?
 * false 10 15 35 45
 * 
 * Testing toArray. New Array Hash: [Ljava.lang.Object;@7bfcd12c
 * 
 * Testing enhanced for-loop print on new Array. 10 15 35 45
 * 
 * List should not be empty; isEmpty returns false.
 * 
 * List should be empty; isEmpty returns true.
 * 
 * 
 */