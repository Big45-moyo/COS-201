/*
 * COS 201 - Computer Programming I
 * Week 2 Exercise: Find and fix the error
 *
 * Student: Ige Enoch Moyosooreoluwa
 *
 * Original (broken) line:
 *     System.out.println("Learning Java")
 *
 * Compiler message:
 *     error: ';' expected
 *
 * Fix: a Java statement must end with a semicolon, so I added ';'
 * at the end of the line. The program now compiles and prints
 * "Learning Java".
 */
public class ErrorExample {

    public static void main(String[] args) {
        System.out.println("Learning Java"); // semicolon added here
    }
}
