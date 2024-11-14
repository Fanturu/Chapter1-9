import java.util.Scanner;

public class StudentAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentData studentData = new StudentData();

        // Input data and calculate averages for three students
        Student student1 = studentData.inputStudentData(scanner, 1);
        double avg1 = student1.calculateAverage();

        Student student2 = studentData.inputStudentData(scanner, 2);
        double avg2 = student2.calculateAverage();

        Student student3 = studentData.inputStudentData(scanner, 3);
        double avg3 = student3.calculateAverage();

        // Display averages
        studentData.displayAverage(avg1, 1);
        studentData.displayAverage(avg2, 2);
        studentData.displayAverage(avg3, 3);

        // Calculate and display the highest average
        double highestAverage = Math.max(avg1, Math.max(avg2, avg3));
        studentData.displayHighestAverage(highestAverage);

        scanner.close();
    }
}
