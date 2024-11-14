package arithmeticprog;
import java.util.Scanner;

public class PriceDiscountedItem {
    public static void main(String[] args) {
        
        String itemName;
        double pricePerItem, totalPrice, discountedPrice;
        double discountRate;
        double quantity, priceAfterDiscount;
        int discountType;
        
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for item details
        System.out.println("Enter item name:");
        itemName = input.nextLine();
        
        System.out.println("Enter item price:");
        pricePerItem = input.nextDouble();
        
        System.out.println("Enter item quantity:");
        quantity = input.nextDouble();
        
        System.out.println("Choose item discount rate. Enter the number of your preferred color:");
        System.out.println("1. Red = 75%");
        System.out.println("2. Green = 50%");
        System.out.println("3. Blue = 25%");
        discountType = input.nextInt();
        
        // Calculate total price before discount
        totalPrice = pricePerItem * quantity;
        
        // Determine discount rate and calculate prices based on user choice
        switch (discountType) {
            case 1:
                discountRate = 0.80; // 80% discount
                break;
            case 2:
                discountRate = 0.60; // 60% discount
                break;
            case 3:
                discountRate = 0.40; // 40% discount
                break;
            default:
                System.out.println("Invalid discount rate selected.");
                input.close();
                return; // Exit the program if invalid discount
        }
        
        // Calculate the discounted price
        discountedPrice = totalPrice * discountRate;
        priceAfterDiscount = totalPrice - discountedPrice;
        
        // Close the Scanner object
        input.close();
        
        // Display results
        System.out.println("\nItem Name: " + itemName);
        System.out.println("Price per Item: $" + String.format("%.2f", pricePerItem));
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + String.format("%.2f", totalPrice));
        System.out.println("Discount Rate: " + (discountRate * 100) + "%");
        System.out.println("Price After Discount: $" + String.format("%.2f", priceAfterDiscount));
    }
}
