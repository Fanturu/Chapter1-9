public class SumOfSquares {
    public static void main(String[] args) {
        int sumOfSquares = 0;

        System.out.println("Squares of integers from 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            int square = i * i;  // Calculate the square of the number
            System.out.println(i + "^2 = " + square);
            sumOfSquares += square;  // Add the square to the total sum
        }

        System.out.println("\nSum of squares of integers from 1 to 10: " + sumOfSquares);
    }
}
