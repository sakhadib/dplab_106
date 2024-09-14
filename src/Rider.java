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

    public void requestRide(){
        System.out.println("Ride Requested!");
    }

    public void rateDriver(){
        System.out.println("Driver Rated!");
    }

    public void makePayment(){
        System.out.println("Payment Made!");
    }

}
