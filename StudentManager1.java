public class StudentManager {
    private Student[] students;

    // Constructor to initialize the Student array
    public StudentManager(Student[] students) {
        this.students = students;
    }

    // Method to find the highest average
    public double findHighestAverage() {
        double highest = students[0].calculateAverage();
        for (Student student : students) {
            double avg = student.calculateAverage();
            highest = Math.max(highest, avg);
        }
        return highest;
    }

    // Method to display all averages
    public void displayAverages() {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Average of Student " + (i + 1) + ": " + students[i].calculateAverage());
        }
    }
}
