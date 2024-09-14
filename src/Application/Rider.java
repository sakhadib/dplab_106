package Application;

import Factory.PaymentFactory;
import Factory.RatingFactory;
import Factory.TripFactory;

public class Rider {
    public int id;
    public String name;
    public String location;
    public double rating;

    public Rider(int id, String name, String location, double rating){
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    public Rider(int id, String name, String location){
        this.id = id;
        this.name = name;
        this.location = location;
    }


    public Trip requestRide(){
        System.out.println("Requesting A Trip!");
        Trip trip = TripFactory.createTrip();
        System.out.println("Trip Requested!");
        trip.assignDriver();
        System.out.println("Driver Assigned! Driver Name: " + trip.driver.name);
        return trip;
    }

    public void rateDriver(){
        double rating = RatingFactory.createDriverRating();
        System.out.println("Driver Rated Successfully! Rating: " + rating + "/5");
        System.out.println("Thanks for the trip!");
    }

    public void makePayment(){
        PaymentFactory.createPayment();
        System.out.println("Payment Made Successfully!");
    }

}
