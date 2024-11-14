public class BreakExample {
    public static void main(String[] args) {
        System.out.println("Numbers 1 - 10");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + "\t");
        }

        System.out.println("\nBroke out of loop at i = 5");
    }
}
    