import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to hold Studentt objects
        Studentt[] students = new Studentt[3];

        // Input marks for 3 students
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Mark 1: ");
            double mark1 = scanner.nextDouble();
            System.out.print("Mark 2: ");
            double mark2 = scanner.nextDouble();
            System.out.print("Mark 3: ");
            double mark3 = scanner.nextDouble();
            students[i] = new Studentt(mark1, mark2, mark3);
        }

        // Create a Studentmanagerr object
        Studentmanagerr manager = new Studentmanagerr(students);

        // Display averages and highest average
        manager.displayAverages();
        double highestAverage = manager.findHighestAverage();
        System.out.println("The highest average is: " + highestAverage);

        scanner.close();
    }
}
