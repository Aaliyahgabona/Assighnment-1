public class Passenger extends User {

    // Attributes
    public String name;
    public int phoneNumber;

    // Methods

    static void requestRide() {
        System.out.println("select destination");
    }
    static void cancelRide() {
        System.out.println("give reason for cancelling ride");
    }
    static void makePayment() {
        System.out.println("make payment");
    }
    static void giveFeedback() {}

}

