public class Driver extends User {

    //Class attributes
    public String name;
    public int phoneNumber;
    public int licenseNumber;
    public int staffID;
    int salary;

    //Class methods

    static void Profile() {
        super.login();
        System.out.println("view details");
    }

    static void acceptRide() {
        System.out.println("pick rider at pickup location");
    }
     static void rejectRide() {
        System.out.println("give reason for rejecting ride request");
    }
    static void completeRide() {}

    static void receivePayment() {
        System.out.println("confirm payment");
    }
    static void viewPayroll() {
        System.out.println("view salary details");
    }

}
