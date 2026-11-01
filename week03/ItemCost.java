/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 3: Total Cost of Items
 *
 * Student:   Ige Enoch Moyosooreoluwa
 * Matric No: 25/16540
 * Programme: Cyber Security
 *
 * Input:      item name (String), quantity (int), unit price (double)
 * Processing: total cost = quantity x unit price
 * Output:     a purchase summary
 *
 * Input check: you cannot buy fewer than 1 item, and a price cannot
 * be negative. If either rule is broken, no total is calculated.
 */
import java.util.Scanner;

public class ItemCost {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        if (quantity < 1 || unitPrice < 0) {
            System.out.println("\nError: quantity must be 1 or more "
                    + "and unit price must not be negative.");
        } else {
            // Processing (Java converts the int quantity to double here)
            double totalCost = quantity * unitPrice;

            // Output
            System.out.println("\n--- PURCHASE SUMMARY ---");
            System.out.println("Item: " + itemName);
            System.out.println("Quantity: " + quantity);
            System.out.printf("Unit price: %.2f%n", unitPrice);
            System.out.printf("Total cost: %.2f%n", totalCost);
        }

        input.close();
    }
}
