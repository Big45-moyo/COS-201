/*
 * COS 201 - Computer Programming I
 * Week 2 Practice Exercise: print() and println()
 *
 * Student: Ige Enoch Moyosooreoluwa
 *
 * What I predicted before running it:
 *   - print("COS ") does not end the line, so "201" comes straight
 *     after it on the same line.
 *   - println("201") ends that line, so "Java" starts on a new line.
 *
 *   Predicted output:
 *       COS 201
 *       Java
 *
 * Result: the program printed exactly what I predicted.
 */
public class PrintExample {

    public static void main(String[] args) {
        System.out.print("COS ");
        System.out.println("201");
        System.out.println("Java");
    }
}
