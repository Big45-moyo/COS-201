/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 2: Student Average Calculator
 *
 * Student:   Ige Enoch Moyosooreoluwa
 * Matric No: 25/16540
 * Programme: Cyber Security
 *
 * Input:      a student's name and three course scores
 * Processing: total = score1 + score2 + score3
 *             average = total / 3
 * Output:     the student's name, total and average
 *
 * Extension exercise: a valid score is from 0 to 100. If any score
 * is outside that range the program refuses to calculate a result,
 * because a total built from an impossible score would be wrong.
 */
import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int COURSES = 3;
        final double MIN_SCORE = 0.0;
        final double MAX_SCORE = 100.0;

        // Input
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter score for Course 1: ");
        double score1 = input.nextDouble();

        System.out.print("Enter score for Course 2: ");
        double score2 = input.nextDouble();

        System.out.print("Enter score for Course 3: ");
        double score3 = input.nextDouble();

        // Extension: reject any score below 0 or above 100
        if (score1 < MIN_SCORE || score1 > MAX_SCORE
                || score2 < MIN_SCORE || score2 > MAX_SCORE
                || score3 < MIN_SCORE || score3 > MAX_SCORE) {
            System.out.println("\nError: each score must be between 0 and 100.");
            System.out.println("Result not calculated. Please run the program again.");
        } else {
            // Processing
            double total = score1 + score2 + score3;
            double average = total / COURSES;

            // Output
            System.out.println("\n--- STUDENT RESULT ---");
            System.out.println("Student: " + name);
            System.out.printf("Total: %.2f%n", total);
            System.out.printf("Average: %.2f%n", average);
        }

        input.close();
    }
}
