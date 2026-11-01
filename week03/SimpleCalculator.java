/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 1: Simple Calculator
 *
 * Student:   Ige Enoch Moyosooreoluwa
 * Matric No: 25/16540
 * Programme: Cyber Security
 *
 * Input:      two numbers typed on the keyboard
 * Processing: sum, difference, product and quotient
 * Output:     each result shown to two decimal places
 *
 * The quotient is only calculated when the second number is not 0,
 * so the program never divides by zero.
 */
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input (double allows whole numbers and decimals)
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        // Processing
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        // Output
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);

        if (secondNumber == 0) {
            System.out.println("Quotient: cannot divide by zero.");
        } else {
            double quotient = firstNumber / secondNumber;
            System.out.printf("Quotient: %.2f%n", quotient);
        }

        input.close();
    }
}
