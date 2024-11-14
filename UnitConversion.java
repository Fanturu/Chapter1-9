import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Unit Conversion Menu:");
            System.out.println("1. Temperature (Celsius - Fahrenheit)");
            System.out.println("2. Distance (Kilometers - Miles)");
            System.out.println("3. Length (Meters - Feet)");
            System.out.println("4. Memory (Kilobytes - Megabytes)");
            System.out.println("5. Weight (Kilograms - Pounds)");
            System.out.println("6. Exit");
            System.out.print("Choose a conversion type: ");
            choice = scanner.nextInt();

            double input, result;
            switch (choice) {
                case 1:
                    System.out.print("Enter 1 for Celsius to Fahrenheit or 2 for Fahrenheit to Celsius: ");
                    if (scanner.nextInt() == 1) {
                        System.out.print("Enter Celsius: ");
                        input = scanner.nextDouble();
                        result = (input * 9/5) + 32;
                        System.out.println("Fahrenheit: " + result);
                    } else {
                        System.out.print("Enter Fahrenheit: ");
                        input = scanner.nextDouble();
                        result = (input - 32) * 5/9;
                        System.out.println("Celsius: " + result);
                    }
                    break;

                case 2:
                    System.out.print("Enter 1 for Kilometers to Miles or 2 for Miles to Kilometers: ");
                    if (scanner.nextInt() == 1) {
                        System.out.print("Enter Kilometers: ");
                        input = scanner.nextDouble();
                        result = input * 0.62;
                        System.out.println("Miles: " + result);
                    } else {
                        System.out.print("Enter Miles: ");
                        input = scanner.nextDouble();
                        result = input / 0.62;
                        System.out.println("Kilometers: " + result);
                    }
                    break;

                case 3:
                    System.out.print("Enter 1 for Meters to Feet or 2 for Feet to Meters: ");
                    if (scanner.nextInt() == 1) {
                        System.out.print("Enter Meters: ");
                        input = scanner.nextDouble();
                        result = input * 3.28;
                        System.out.println("Feet: " + result);
                    } else {
                        System.out.print("Enter Feet: ");
                        input = scanner.nextDouble();
                        result = input / 3.28;
                        System.out.println("Meters: " + result);
                    }
                    break;

                case 4:
                    System.out.print("Enter 1 for Kilobytes to Megabytes or 2 for Megabytes to Kilobytes: ");
                    if (scanner.nextInt() == 1) {
                        System.out.print("Enter Kilobytes: ");
                        input = scanner.nextDouble();
                        result = input / 1024;
                        System.out.println("Megabytes: " + result);
                    } else {
                        System.out.print("Enter Megabytes: ");
                        input = scanner.nextDouble();
                        result = input * 1024;
                        System.out.println("Kilobytes: " + result);
                    }
                    break;

                case 5:
                    System.out.print("Enter 1 for Kilograms to Pounds or 2 for Pounds to Kilograms: ");
                    if (scanner.nextInt() == 1) {
                        System.out.print("Enter Kilograms: ");
                        input = scanner.nextDouble();
                        result = input * 2.2;
                        System.out.println("Pounds: " + result);
                    } else {
                        System.out.print("Enter Pounds: ");
                        input = scanner.nextDouble();
                        result = input / 2.2;
                        System.out.println("Kilograms: " + result);
                    }
                    break;

                case 6:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); // New line for readability

        } while (choice != 6);

        scanner.close();
    }
}
