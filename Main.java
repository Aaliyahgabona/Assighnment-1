public class Main {

    // create objects of the classes and call their methods here
    public static void main(String[] args) {


        Passenger passenger = new Passenger();
        Driver driver = new Driver();
        Vehicle vehicle = new Vehicle();
        Parcel parcel = new Parcel();
        Bus bus = new Bus();
        Feedback feedback = new Feedback();
    

        // Call methods of the classes
        
        passenger.requestRide();
        passenger.cancelRide();
        passenger.makePayment();
        passenger.giveFeedback();

        driver.acceptRide();
        driver.completeRide();
        driver.receivePayment();
        driver.viewPayroll();
        driver.rejectRide();

        parcel.confirmParcel();
        parcel.trackParcel(); 
        parcel.makePayment();  

       
        feedback.submitFeedback();

    }
    





}
