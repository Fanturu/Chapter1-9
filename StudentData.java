import java.util.Scanner;

public class StudentData {
    // Method to create a Student object based on user input
    public Student inputStudentData(Scanner scanner, int studentNumber) {
        System.out.println("Enter marks for Student " + studentNumber + ":");
        double mark1 = scanner.nextDouble();
        double mark2 = scanner.nextDouble();
        double mark3 = scanner.nextDouble();
        return new Student(mark1, mark2, mark3);
    }

    // Method to display average marks
    public void displayAverage(double average, int studentNumber) {
        System.out.println("Average of Student " + studentNumber + ": " + average);
    }

    // Method to display the highest average
    public void displayHighestAverage(double highestAverage) {
        System.out.println("The highest average is: " + highestAverage);
    }
}
