import java.util.Scanner;

/**
   Implementing a class testing LinkedBag
  
   @author Fahim Jeylani-Tran
   @version 9/4/20
 */
public class LinkingNodes {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        LinkedBag<String> namesBag = new LinkedBag<>();
        String userInput = "";
        int numberOfNames = 4;

        System.out.println("\nWelcome to the LinkedBag Program!");
        System.out.println("You will enter " + numberOfNames + " names, delete a name, check for a name, and see the end result!");
        for (int i = 1; i <= numberOfNames; i++) {
            System.out.print("Enter name " + i + ": ");
            userInput = keyboard.nextLine();
            namesBag.add(userInput);
        }

        System.out.print("\nDelete a name: ");
        userInput = keyboard.nextLine();
        if (namesBag.contains(userInput)) {
            namesBag.remove(userInput);
        }

        System.out.print("\nEnter a name to check for: ");
        userInput = keyboard.nextLine();
        System.out.println("Does " + userInput + " exist in namesBag? " + namesBag.contains(userInput));

        System.out.println("\nCurrent namesBag content: ");
        namesBag.printBag();

        System.out.println("\n\n--End Of Program--");
    }
}

/**
    A class of bags whose entries are stored in a chain of linked nodes.
    The bag is never full.    
 */
final class LinkedBag<T> implements BagInterface<T> {
    private Node firstNode;     // Reference to the first node
    private int numberOfEntries;

    public LinkedBag() {
        firstNode = null;
        numberOfEntries = 0;
    } // end default constructor

    /** Gets the current number of entries in this bag
        @return The integer number of entries currently in the bag. */
    public int getCurrentSize() {
        return numberOfEntries;
    }

    /** Sees whether this bag is empty.
        @return True if the bag is empty, or false if not. */
    public boolean isEmpty() {
        return (numberOfEntries == 0);
    }

    /** Adds a new entry to this bag.
        @param newEntry The object to be added as a new entry.
        @return True if the addition is successful, or false if not. */
    public boolean add(T newEntry) {
        Node newNode = new Node(newEntry);
        newNode.next = firstNode;   // Make new node reference the rest of chain
                                    // (firstNode is null if chain is empty)
        firstNode = newNode;        // New node is at beginning of chain
        numberOfEntries++;
        return true;
    } // end add

    /** Removes one unspecified entry from this bag, if possible.
        @return Either the removed entry, if the removal was successful, or null */
    public T remove() {
        Node removedNode = firstNode;
        if (firstNode != null) {
            firstNode = firstNode.next;
        }
        if (numberOfEntries > 0) {
            numberOfEntries--;
        }
        return removedNode.data;
    }

    /** Removes one occurence of a given entry from this bag, if possible.
        @param anEntry The entry to be removed.
        @return True if the removal was successful, or false if not. */
    public boolean remove(T anEntry) {
        Node removedNode = null;
        Node head = firstNode;
        while (head != null) {
            if (head.data.equals(anEntry)) {
                firstNode = head.next;
                numberOfEntries--;
                return true;
            }
            if (head.next != null && head.next.data.equals(anEntry)) {
                head.next = head.next.next;
                numberOfEntries--;
                return true;
            }
            head = head.next;
        }
        return false;
    }

    /** Removes all entries from this bag. */
    public void clear() {
        firstNode = null;
        numberOfEntries = 0;
    }

    /** Counts the number of times a given entry appears in this bag.
        @param anEntry The entry to be counted.
        @return The number of times anEntry appears in the bag. */
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        Node head = firstNode;
        while (head != null) {
            if (head.data.equals(anEntry)) {
                count++;
            }
            head = head.next;
        }
        return count;
    }

    /** Tests whether this bag contains a given entry.
        @param anEntry The entry to find.
        @return True if the bag contains anEntry, or false if not. */
    public boolean contains(T anEntry) {
        Node head = firstNode;
        while (head != null) {
            if (head.data.equals(anEntry)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    /** Retrieves all entries that are in this bag
        @return A newly allocated array of all the entries in the bag.
                Note: If the bag is empty, the returned array is empty. */
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];
        Node head = firstNode;
        int i = 0;
        while (head != null && i < numberOfEntries) {
            result[i] = head.data;
            head = head.next;
            i++;
        }
        return result;
    }

    /** Prints the content of the bag. */
    public void printBag() {
        Node head = firstNode;
        while (head != null) {
            System.out.println(head.data.toString());
            head = head.next;
        }
    }

    private class Node {
        private T data;     // Entry in bag
        private Node next;  // Link to next node

        private Node(T dataPortion) {
            this(dataPortion, null);
        }

        private Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        }
    } // end Node
}

/**
   An interface that describes the operations of a bag of objectts
  
   @author Frank M. Carrano, Timothy M. Henry
 */
interface BagInterface<T> {
    /** Gets the current number of entries in this bag
        @return The integer number of entries currently in the bag. */
    public int getCurrentSize();

    /** Sees whether this bag is empty.
        @return True if the bag is empty, or false if not. */
    public boolean isEmpty();

    /** Adds a new entry to this bag.
        @param newEntry The object to be added as a new entry.
        @return True if the addition is successful, or false if not. */
    public boolean add(T newEntry);

    /** Removes one unspecified entry from this bag, if possible.
        @return Either the removed entry, if the removal was successful, or null */
    public T remove();

    /** Removes one occurence of a given entry from this bag, if possible.
        @param anEntry The entry to be removed.
        @return True if the removal was successful, or false if not. */
    public boolean remove(T anEntry);

    /** Removes all entries from this bag. */
    public void clear();

    /** Counts the number of times a given entry appears in this bag.
        @param anEntry The entry to be counted.
        @return The number of times anEntry appears in the bag. */
    public int getFrequencyOf(T anEntry);

    /** Tests whether this bag contains a given entry.
        @param anEntry The entry to find.
        @return True if the bag contains anEntry, or false if not. */
    public boolean contains(T anEntry);

    /** Retrieves all entries that are in this bag
        @return A newly allocated array of all the entries in the bag.
                Note: If the bag is empty, the returned array is empty. */
    public T[] toArray();
}

/** Output

Welcome to the LinkedBag Program!
You will enter 4 names, delete a name, check for a name, and see the end result!
Enter name 1: John
Enter name 2: James
Enter name 3: Susie
Enter name 4: Poo

Delete a name: Poo

Enter a name to check for: James
Does James exist in namesBag? true

Current namesBag content:
Susie
James
John


--End Of Program--

 */