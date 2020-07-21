import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

/**
 * Implementing a class testing Data Structures
 *
 * @author Fahim Jeylani-Tran
 * @version 7/19/20
 */
public class DataStructures {
    private static Map<String, String> studentGrades = new TreeMap<>();

    /**
     * Main method for testing Data Structures
     * @param args command line arguments (not used for this project)
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Greetings and Instructions
        System.out.println("\nWelcome to the Data Structures Grades Program!");
        System.out.println("We use this convention of storing grades: [Name] => Grade");
        System.out.println("Keep in mind that your input is case sensitive!");

        boolean isFinished = false;
        while (!isFinished) {
            isFinished = promptUser(keyboard);
        }
        
        keyboard.close();

        // End of Program Display
        System.out.println("Exited program successfully.");
    }

    /**
     * Prompts the user for a integer based input
     * @param keyboard scanner reference so resources aren't saved
     * @return boolean that represents if the user is finished using the program
     */
    private static boolean promptUser(Scanner keyboard) {
        // Prompt Display and Catching Extra Line Character
        System.out.println("\nChoose an option: ");
        System.out.println( "1 - Add Students"
                        + "\n2 - Remove Students"
                        + "\n3 - Modify Grades"
                        + "\n4 - Print All Grades"
                        + "\n5 - Exit Program");
        int userInput = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println();

        // Branching and Validation
        if (userInput == 5) {
            return true;
        } else if (userInput >= 1 && userInput < 5) {
            processInput(userInput, keyboard);
            return false;
        } else {
            System.out.println("Invalid input.");
            return false;
        }
    }

    /**
     * Processes input given from promptUser
     * @param userInput integer input given by user from promptUser
     * @param keyboard scanner reference passed down from main method
     */
    private static void processInput(int userInput, Scanner keyboard) {
        // switch-case to branch off processing to respective methods
        switch (userInput) {
            case 1:
                addStudents(keyboard);
                break;
            case 2:
                removeStudents(keyboard);
                break;
            case 3:
                modifyGrades(keyboard);
                break;
            case 4:
                printGrades(studentGrades);
                break;
        }
    }

    /**
     * Method for adding students to the Map of students and grades
     * @param keyboard scanner reference passed down from main method
     */
    private static void addStudents(Scanner keyboard) {
        // Local variables used for loop sentinel and user input
        boolean isContinuing = true;
        char userInput;
        String name = "";
        String grade = "";

        // Loop that allows user to continue entering students until they're done
        while (isContinuing) {
            System.out.print("Enter a name >> ");
            name = keyboard.nextLine();
            System.out.print("Enter a grade >> ");
            grade = keyboard.nextLine();

            // Core adding implementation
            if (name.length() > 0 && grade.length() > 0) {
                studentGrades.put(name, grade);
            }

            System.out.print("\nContinue? Y or N >> ");
            userInput = keyboard.nextLine().charAt(0);

            if (userInput == 'N') {
                isContinuing = false;
            } else if (userInput == 'Y') {
                continue;
            } else {
                System.out.println("Invalid input. Continuing by default.");
            }
        }
    }

    /**
     * Method for removing students from the Map of students and grades
     * @param keyboard scanner reference passed down from main method
     */
    private static void removeStudents(Scanner keyboard) {
        // Local variables used for loop sentinel and user input
        boolean isContinuing = true;
        char userInput;
        String name = "";

        // Loop that allows user to continue removing students until they're done
        while (isContinuing) {
            System.out.println(studentGrades.keySet());
            System.out.print("Choose a student to remove >> ");
            name = keyboard.nextLine();

            // Core removal implementation
            if (studentGrades.containsKey(name)) {
                studentGrades.remove(name);
                System.out.println("Successfully removed " + name + ".");
            } else {
                System.out.println("Student name, " + name + ", not found.");
            }

            System.out.print("\nContinue? Y or N >> ");
            userInput = keyboard.nextLine().charAt(0);

            if (userInput == 'N') {
                isContinuing = false;
            } else if (userInput == 'Y') {
                continue;
            } else {
                System.out.println("Invalid input. Continuing by default.");
            }
        }
    }

    /**
     * Method for modifying grades from the Map of students and grades
     * @param keyboard scanner reference passed down from main method
     */
    private static void modifyGrades(Scanner keyboard) {
        // Local variables used for loop sentinel and user input
        boolean isContinuing = true;
        char userInput;
        String name = "";
        String grade = "";

        // Loop that allows user to continue removing students until they're done
        while (isContinuing) {
            System.out.println(studentGrades);
            System.out.print("Choose a student to modify their grade >> ");
            name = keyboard.nextLine();

            // Core modification implementation
            if (studentGrades.containsKey(name)) {
                System.out.print("Enter new grade >> ");
                grade = keyboard.nextLine();

                studentGrades.replace(name, grade);
                System.out.println("Grade successfully changed.");
            } else {
                System.out.println("Student name," + name + ", not found.");
            }

            System.out.print("\nContinue? Y or N >> ");
            userInput = keyboard.nextLine().charAt(0);

            if (userInput == 'N') {
                isContinuing = false;
            } else if (userInput == 'Y') {
                continue;
            } else {
                System.out.println("Invalid input. Continuing by default.");
            }
        }
    }

    /**
     * A method to print the students and grades from a map in order by name
     * @param map a map of the students and grades stored in the class
     */
    private static <K, V> void printGrades(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}