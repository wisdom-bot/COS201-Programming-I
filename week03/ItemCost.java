import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        final double TAX_RATE = 0.075; // 7.5% - change as needed

        Scanner input = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String name = input.nextLine();

        System.out.print("Enter unit price: ");
        double price = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        if (price < 0 || quantity <= 0) {
            System.out.println("Error: price cannot be negative and quantity must be at least 1.");
            input.close();
            return;
        }

        double subtotal = price * quantity;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        System.out.println();
        System.out.println("----- Receipt -----");
        System.out.println("Item:      " + name);
        System.out.printf("Unit price: %.2f%n", price);
        System.out.println("Quantity:  " + quantity);
        System.out.printf("Subtotal:  %.2f%n", subtotal);
        System.out.printf("Tax (%.1f%%): %.2f%n", TAX_RATE * 100, tax);
        System.out.printf("Total:     %.2f%n", total);

        input.close();
    }
}