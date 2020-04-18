import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

/**
 * An application that reverses a text file.
 *
 * @author Fahim Jeylani-Tran
 * @version 4/18/2020
 */
public class ReverseFile {
    public static void main(String[] args) {
        // Initial setup
        Scanner in = new Scanner(System.in);
        boolean finished = false;

        // While not finished, loop until the program writes an output
        while (!finished) {
            try {
                // Prompt User for inputFileName and reads in lines of inputFile
                System.out.print("Please enter the file name for input: ");
                String inputFileName = in.nextLine();
                ArrayList<String> lines = readFile(inputFileName);

                // Prompt User for outputFilename and outputs reversed lines earlier read
                System.out.print("\nPlease enter the file name for output: ");
                String outputFileName = in.nextLine();
                writeInReverse(outputFileName, lines);
                finished = true;
                
            } catch (FileNotFoundException exception) {
                System.out.println("File not found.");
            } catch (NoSuchElementException exception) {
                System.out.println("Empty file.");
            } catch (IOException exception) {
                System.out.println("Failure accessing file.");
            }
        }
    }

    /**
     * Creates input buffer to aid in creation of ArrayList holding lines.
     * @param fileName name of file to be read
     * @return an ArrayList filled with the lines of a file
     */
    public static ArrayList<String> readFile(String fileName) throws IOException {
        // Creates a new input buffer and passes it to another method for reading
        File inputFile = new File(fileName);
        try (Scanner inputFileReader = new Scanner(inputFile)) {
            return readLinesOfArray(inputFileReader);
        }
    }

    /**
     * Iterates through a file given a Scanner input buffer.
     * @param inputFileReader Scanner input buffer
     * @return an ArrayList filled with the lines of the given buffer
     */
    public static ArrayList<String> readLinesOfArray(Scanner inputFileReader) {
        // Receives input buffer and reads in lines of text to return an ArrayList
        ArrayList<String> lines = new ArrayList<String>();
        while (inputFileReader.hasNextLine()) {
            lines.add(inputFileReader.nextLine());
        }
        return lines;
    }

    /**
     * Handles the core logic of reversing the lines of a given file and outputting it.
     * @param fileName given file to write to
     * @param lines the prepared lines of a file to be reversed
     */
    public static void writeInReverse(String fileName, ArrayList<String> lines) {
        // Creates a new output buffer using PrintWriter and reverses lines received
        try {
            PrintWriter outputWriter = new PrintWriter(fileName);
            for (int i = lines.size() - 1; i >= 0; i--) {
                outputWriter.println(lines.get(i));
            }
            outputWriter.close();
        } catch (FileNotFoundException exception) {
            System.out.println("File not found.");
        }
    }
}