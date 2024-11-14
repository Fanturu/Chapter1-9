import java.util.Scanner;

public class YouGrade { 
    public static void main(String[] args) {
        int mark;

        // Create a Scanner object to read input from the user
        Scanner reader = new Scanner(System.in); 
        
        // Prompt the user to enter their mark
        System.out.println("Enter your mark:");
        mark = reader.nextInt(); 

        // Close the Scanner object
        reader.close();

        // Determine the grade based on the mark using if..else if statement
        if (mark >= 90) {
            System.out.println("A+");
        } else if (mark >= 80) {
            System.out.println("B");
        } else if (mark >= 70) {
            System.out.println("C");
        } else if (mark >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
