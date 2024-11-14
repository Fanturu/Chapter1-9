import java.util.Scanner;

public class SwitchDemo { 
    public static void main(String[] args) { 
        int month; // Declare an integer variable to store the month number
        
        // Create a Scanner object to read input from the user
        Scanner reader = new Scanner(System.in); 
        
        // Prompt the user to enter a month number
        System.out.println("Enter month:");
        
        // Read an integer input from the user
        month = reader.nextInt(); 
        
        // Use a switch statement to print the corresponding month name
        switch (month) { 
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid month.");
        }
        
        // Close the Scanner object
        reader.close();
    }
}
