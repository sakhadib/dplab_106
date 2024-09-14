package Payment;

public class PaypalPayment implements Payment{

    public String email;
    public int otp;

    public PaypalPayment(String email, int otp){
        this.email = email;
        this.otp = otp;
    }

    @Override
    public void pay() {
        System.out.println("Paid Through Paypal!");
    }
}
