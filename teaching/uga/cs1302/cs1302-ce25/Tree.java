import java.io.File;
import java.util.Arrays;

public class Tree {

    /**
     * Recursive implementation of the Unix tree command.
     */
    public static void printTree(File file, String prepend) {
        String holder = "|---";

        if (file.isDirectory()) {
            System.out.println(prepend + holder + file.getName());
            for (File files : file.listFiles()) {
                printTree(files, prepend + "|   ");
            }
        } else if (file.isFile()) {
            System.out.println(prepend + holder + file.getName());
        } else {
            System.err.printf("list: '%s': No such directory\n", file.getName());
        }
        
    } // printTree
 
    public static void main(String[] args) {
        if (args.length == 0) {
            args = new String[] { "." }; // default to "."
        } // if
        Arrays.stream(args)
            .map(f -> new File(f))
            .forEach(f -> printTree(f, ""));
        // TODO implement stream code
    } // main

} // Tree