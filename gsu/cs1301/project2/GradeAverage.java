import java.util.Scanner;

/**
 * Calculates the final grade average of the user.
 * Also displays if the user qualifies for the next course.
 *
 * @author Fahim Jeylani-Tran
 * @version 3/3/2020
 */
public class GradeAverage {
    public static void main(String[] args) {
        // Declares constants for different weights
        final double TEST_WEIGHT = 40.0 / 100;
        final double MIDTERM_WEIGHT = 25.0 / 100;
        final double FINAL_EXAM_WEIGHT = 35.0 / 100;

        // Creates Scanner Object for user input
        Scanner in = new Scanner(System.in);

        // Prompts user for Test scores # 1 - 3
        System.out.print("Enter Test score #1: ");
        double testScore1 = in.nextDouble();
        System.out.print("Enter Test score #2: ");
        double testScore2 = in.nextDouble();
        System.out.print("Enter Test score #3: ");
        double testScore3 = in.nextDouble();

        // Calculates Test average
        double testTotal = testScore1 + testScore2 + testScore3;
        double testAverage = testTotal / 3;

        // Prompts user for Midterm exam score
        System.out.print("Enter Midterm exam score: ");
        double midtermExamScore = in.nextDouble();
        
        // Prompts user for Final exam score
        System.out.print("Enter Final exam score: ");
        double finalExamScore = in.nextDouble();

        // Calculates Grade average for user
        double gradeAverage = 0;
        gradeAverage += (TEST_WEIGHT * testAverage);
        gradeAverage += (MIDTERM_WEIGHT * midtermExamScore); 
        gradeAverage += (FINAL_EXAM_WEIGHT * finalExamScore);

        // Calculates letter grade
        char letterGrade;

        // Chains if-else statements using the simplest boolean expression
        if (gradeAverage >= 90)
        {
            letterGrade = 'A';
        }
        else if (gradeAverage >= 80)
        {
            letterGrade = 'B';
        }
        else if (gradeAverage >= 70)
        {
            letterGrade = 'C';
        }
        else if (gradeAverage >= 60)
        {
            letterGrade = 'D';
        }
        else
        {
            letterGrade = 'F';
        }

        // Outputs Results
        System.out.printf("%nGrade Average: %.2f%n", gradeAverage);
        System.out.printf("Letter grade:  %c%n", letterGrade);

        // Checks and outputs if user's grade is passing
        if (letterGrade == 'A' || letterGrade == 'B' || letterGrade == 'C')
        {
            System.out.println("Good job. You met the prerequisite for the next course.");
        }
        else
        {
            System.out.println("I'm sorry. You will have to repeat the course before advancing.");
        }
    }
}