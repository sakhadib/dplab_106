package Application;

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

    public void startTrip(){
        System.out.println("Trip Started!");
    }

    public void rateDriver(){
        System.out.println("Application.Driver Rated!");
    }

    public void makePayment(){
        System.out.println("Payment Made!");
    }

}
