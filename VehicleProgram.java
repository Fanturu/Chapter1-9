import java.util.Scanner;

public class VehicleProgram {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        
        System.out.println("Welcome to the Vehicle Program!");
        System.out.print("Enter the type of vehicle (car, truck, motorcycle): ");
        String vehicleType = readInput.nextLine();
        
        switch (vehicleType.toLowerCase()) {
            case "car":
                System.out.println("You've selected a car. Enjoy the ride!");
                break;
            case "truck":
                System.out.println("Trucks are great for hauling heavy loads!");
                break;
            case "motorcycle":
                System.out.println("Motorcycles offer an exhilarating experience!");
                break;
            default:
                System.out.println("Unknown vehicle type. Please choose car, truck, or motorcycle.");
                break;
        }
        
        readInput.close();
    }
}
