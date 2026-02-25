public class Parcel {

    // Attributes of the Parcel class
     int parcelId;
    String senderName;
    String receiverName;
    String pickupLocation;
    int weight;
    char durability;

    // Methods of the Parcel class

    static void confirmParcel() {
        System.out.println("confirm parcel recieved");
    }

    static void trackParcel() {
        System.out.println("parcel location is...");
    }
    static void makePayment() {}
}
