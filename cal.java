import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator App");
        System.out.println("Available operations: +, -, *, /");

        while (true) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter an operation (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero");
                        continue;  // Skip the rest of the loop iteration
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
                    continue;  // Skip the rest of the loop iteration
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to perform another calculation? (y/n): ");
            char repeat = scanner.next().charAt(0);
            if (repeat != 'y' && repeat != 'Y') {
                System.out.println("Calculator app closing. Goodbye!");
                break;  // Exit the loop and end the program
            }
        }

        scanner.close();
    }
}
