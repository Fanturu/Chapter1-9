import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Classify each number as odd or even
        for (int i = 0; i < 5; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is Even");
            } else {
                System.out.println(numbers[i] + " is Odd");
            }
        }

        scanner.close();
    }
}