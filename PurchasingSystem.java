package purchasingSystem;

import java.util.Scanner;

public class PurchasingSystem {
    public static void main(String[] args) {
        // Define item details
        String item1Name = "Sushi";
        double item1Price = 4.90;

        String item2Name = "Oyishi";
        double item2Price = 2.50;

        String item3Name = "Onigiri";
        double item3Price = 3.00;

        // Create a Scanner object to read input from the user
        Scanner reader = new Scanner(System.in);

        // Display the item menu
        System.out.println("Welcome to the Purchasing System!");
        System.out.println("Please choose an item from the following list:");
        System.out.println("1. " + item1Name + " - $" + item1Price);
        System.out.println("2. " + item2Name + " - $" + item2Price);
        System.out.println("3. " + item3Name + " - $" + item3Price);

        // Read user's choice of item
        System.out.println("Enter the number of the item you want to purchase:");
        int itemChoice = reader.nextInt();
        
        // Validate item choice and determine selected item and price
        double pricePerItem = 0.0;
        String selectedItem = "";

        switch (itemChoice) {
            case 1:
                selectedItem = item1Name;
                pricePerItem = item1Price;
                break;
            case 2:
                selectedItem = item2Name;
                pricePerItem = item2Price;
                break;
            case 3:
                selectedItem = item3Name;
                pricePerItem = item3Price;
                break;
            default:
                System.out.println("Invalid item choice. Please restart the program.");
                reader.close();
                return;
        }

        // Read quantity
        System.out.println("Enter quantity:");
        int quantity = reader.nextInt();

        // Validate quantity
        if (quantity <= 0) {
            System.out.println("Invalid quantity. Please restart the program.");
            reader.close();
            return;
        }

        // Process the order
        double totalPrice = pricePerItem * quantity;

        // Display order details
        System.out.println("\nOrder Summary:");
        System.out.println("Item: " + selectedItem);
        System.out.println("Price per Item: $" + String.format("%.2f", pricePerItem));
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + String.format("%.2f", totalPrice));

        // Close the Scanner object
        reader.close();
    }
}
