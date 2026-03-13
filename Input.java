
import java .util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details required:");

        //string inputs
        String Name = scanner.nextLine(); 
        String Email = scanner.nextLine(); 
        String Password = scanner.nextLine();  
        String Role = scanner.nextLine();
        String PickupLocation = scanner.nextLine();
        String sendername = scanner.nextLine();
        String receivername = scanner.nextLine();


    //Numerical inputs
        int phoneNumber = scanner.nextInt();
        int licenseNumber = scanner.nextInt();
        int staffID = scanner.nextInt();
        int numberplate = scanner.nextInt();


        //outputs

        System.out.println("You entered: " + Name);
        System.out.println("You entered: " + Email);
        System.out.println("You entered: " + Password);
        System.out.println("You entered: " + Role);
        System.out.println("You entered: " + PickupLocation);
        System.out.println("You entered: " + sendername);
        System.out.println("You entered: " + receivername);
        System.out.println("You entered: " + phoneNumber);
        System.out.println("You entered: " + licenseNumber);
        System.out.println("You entered: " + staffID);
        System.out.println("You entered: " + numberplate);
    }
}