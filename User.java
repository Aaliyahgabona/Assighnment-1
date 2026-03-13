 import java.util.Scanner;
public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    // Attributes
    public String name;
    public String password;
    public int phoneNumber;
    char email;
    char role;

    // Methods

    static void register() {
        
    System.out.println("enter details");
    String Name = scanner.nextLine();
    System.out.println("You entered: " + Name);

       
    }
    static void login() {
        System.out.println("enter username and password");
        String Name = scanner.nextLine();
        String Password = scanner.nextLine();
        System.out.println("You entered: " + Name);
        System.out.println("You entered: " + Password);
    }
      
    static void updateProfile() {
        System.out.println("update details");
        String Name = scanner.nextLine();
        String Password = scanner.nextLine();
        System.out.println("You entered: " + Name);
        System.out.println("You entered: " + Password);
    
}
}
}
