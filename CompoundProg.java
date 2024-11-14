public class CompoundProg {
    public static void main(String[] args) {

        int var = 10;

        System.out.println("Initial value of var: " + var);
        System.out.println("Pre-increment: ++var");
        System.out.println("Value before increment: " + var);
        int preIncrement = ++var;
        System.out.println("Value after increment: " + preIncrement);
        System.out.println("Current value of var: " + var);

        var = 10;

        System.out.println("\nInitial value of var: " + var);
        System.out.println("Post-increment: var++");
        System.out.println("Value before increment: " + var);
        int postIncrement = var++;
        System.out.println("Returned value: " + postIncrement);
        System.out.println("Value after increment: " + var);

        var = 10;

        System.out.println("\nInitial value of var: " + var);
        System.out.println("Pre-decrement: --var");
        System.out.println("Value before decrement: " + var);
        int preDecrement = --var;
        System.out.println("Value after decrement: " + preDecrement);
        System.out.println("Current value of var: " + var);

        var = 10;

        System.out.println("\nInitial value of var: " + var);
        System.out.println("Post-decrement: var--");
        System.out.println("Value before decrement: " + var);
        int postDecrement = var--;
        System.out.println("Returned value: " + postDecrement);
        System.out.println("Value after decrement: " + var);
    }
}
