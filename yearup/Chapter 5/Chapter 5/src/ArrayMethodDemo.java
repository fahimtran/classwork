package arraymethoddemo;

/**
 * @author Fahim Jeylani-Tran
 */
import java.util.Scanner;
public class ArrayMethodDemo {

    public static void main(String[] args) {
        
        /**
         * For the array, I just put all possible digits from 0 to 9 
         * as the 10 integers in the array.
         */
        
        int[] test = {1, 0, 2, 4, 3, 5, 7, 6, 8, 9};
        
        displayIntegers(test);
        
        displayReverseOrder(test);
        
        displayIntegersSum(test);
        
        /**
         * For this method, I made it so that it took in user input, 
         * because it didn't specify what limiting argument it needed.
         */
        
        displayIntegersUnderLimitingArgument(test);
        
        displayIntegersHigherThanAverage(test);
    }
    
    public static void displayIntegers(int[] x){
        System.out.println("Integer Array Elements displayed in order: ");
        
        for(int y: x){
            System.out.print(y + " ");
        }
        System.out.println();
    }
    
    public static void displayReverseOrder(int[] x){
        System.out.println("\nInteger Array Elements"
                + " displayed in reverse order: ");
        
        for(int y = x.length - 1;y >= 0; --y){
            System.out.print(x[y] + " ");
        }
        System.out.println();
    }
    
    public static void displayIntegersSum(int[] x){
        int sum = 0;
        
        for(int y: x){
            sum += y;
        }
        
        System.out.println("\nThe sum of all"
                + " Integer Array Elements is: " + sum);
        System.out.println();
    }
    
    public static void displayIntegersUnderLimitingArgument(int[] x){
        Scanner input = new Scanner(System.in);
        int limitingArgument = 0;
        
        System.out.println("Enter a limiting argument; for each "
                + "Integer Array Element that is less than your argument"
                + " will be displayed: ");
        limitingArgument = input.nextInt();
        
        System.out.println("Integer Array Elements less than " 
                + limitingArgument + " are: ");
        
        for(int y: x){
            if(y < limitingArgument){
                System.out.print(y + " ");
            }
        }
        System.out.println();
    }
    
    public static void displayIntegersHigherThanAverage(int[] x){
        double avg = 0;
        double sum = 0;
        
        for(int y: x){
            sum += y;
        }
        
        avg = (sum/x.length);
        
        System.out.println("\nThe Integer Array Elements that are"
                + " higher than the calculated average, " + avg + ", are: ");
        
        for(int y: x){
            if(y > avg){
                System.out.print(y + " ");
            }
        }
        System.out.println();
    }
}
