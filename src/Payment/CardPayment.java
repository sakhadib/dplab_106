package Payment;

public class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid Through Card!");
    }
}
