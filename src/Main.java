import Factory.*;
import Application.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Ridoo App!");

        System.out.println("\n\nRegister Yourself as a Rider:");
        Rider rider = RiderFactory.crateRider();


        Trip currentTrip = rider.requestRide();

        currentTrip.driver.acceptRide();


    }
}