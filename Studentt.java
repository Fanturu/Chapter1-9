public class Studentt {
    private double mark1, mark2, mark3;

    // Constructor to initialize marks
    public Studentt(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Method to calculate the average marks
    public double calculateAverage() {
        return (mark1 + mark2 + mark3) / 3;
    }
}
