package arithmeticprog;
import java.util.Scanner;

public class ArithmeticProg {
    public static void main(String[] args) {
        int num1;
        int num2;
        char operator;

        // Create a Scanner object to read input from the user
        Scanner reader = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter first number:");
        num1 = reader.nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter second number:");
        num2 = reader.nextInt();

        // Display a menu of arithmetic operations
        System.out.println("Choose an operator:");
        System.out.println(" + : Addition");
        System.out.println(" - : Subtraction");
        System.out.println(" * : Multiplication");
        System.out.println(" / : Division");
        System.out.println(" % : Modulus");

        // Read the user's choice of operator
        System.out.println("Enter operator:");
        operator = reader.next().charAt(0);

        // Close the Scanner object
        reader.close();

        // Perform the operation based on the user's choice
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result of Addition: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result of Subtraction: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result of Multiplication: " + result);
                break;
            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    result = (double) num1 / num2;
                    System.out.println("Result of Division: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result of Modulus: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }
    }
}
