import java.util.Scanner;

public class InputExp {
    
    public static void main(String[] args){
        
        String firstname;
        String lastname;
        Scanner in = new Scanner (System.in);{
        
            System.out.print("Input your first name: ");
            firstname = in.nextLine();
            
            System.out.print("Input your last name: ");
            lastname = in.nextLine();
    }
            System.out.println("");
            System.out.println("Hello");
            System.out.println("" + firstname + " " +lastname);
    }
        
    }