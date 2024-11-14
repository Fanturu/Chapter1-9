import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        // Prompt the user to enter their height in meters
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        // Calculate the BMI
        double bmi = weight / (height * height);

        // Display the BMI
        System.out.printf("Your BMI is: %.2f%n", bmi);

        // Provide interpretation of the BMI
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        // Close the Scanner