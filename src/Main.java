import Factory.*;
import Application.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Ridoo App!");

        System.out.println("\nRegister Yourself as a Rider:");
        Rider rider = RiderFactory.crateRider();


        Trip currentTrip = rider.requestRide();

        currentTrip.driver.acceptRide();
        System.out.println("Trip Running...");
        currentTrip.driver.endTrip();
        rider.makePayment();

        rider.rateDriver();
        currentTrip.driver.rateRider();

    }
}