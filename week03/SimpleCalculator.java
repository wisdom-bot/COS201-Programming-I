import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again;

        do {
            System.out.print("Enter first number: ");
            double a = input.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char op = input.next().charAt(0);

            System.out.print("Enter second number: ");
            double b = input.nextDouble();

            switch (op) {
                case '+':
                    System.out.println("Result: " + (a + b));
                    break;
                case '-':
                    System.out.println("Result: " + (a - b));
                    break;
                case '*':
                    System.out.println("Result: " + (a * b));
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Error: cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (a / b));
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
            }

            System.out.print("Calculate again? (y/n): ");
            again = input.next();
        } while (again.equalsIgnoreCase("y"));

        System.out.println("Goodbye!");
        input.close();
    }
}