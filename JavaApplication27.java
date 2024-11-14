class JavaApplication27 {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;

        System.out.println("Even numbers between 1 and 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // Check if the number is even
                System.out.print(i + " ");
                sumEven += i;  // Add to the sum of even numbers
            }
        }

        System.out.println("\nSum of even numbers: " + sumEven);

        System.out.println("\nOdd numbers between 1 and 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                System.out.print(i + " ");
                sumOdd += i;  // Add to the sum of odd numbers
            }
        }

        System.out.println("\nSum of odd numbers: " + sumOdd);
    }
}
