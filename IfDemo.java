import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        
        int grade; 
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your grade:");
        grade = reader.nextInt();
    
        if (grade >= 60) {
            System.out.println("Passed");
        }
    }
}
