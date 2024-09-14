package Payment;

public class CashPayment implements Payment {

    public CashPayment() {

    }

    @Override
    public void pay() {
        System.out.println("Paid Through Cash!");
    }
}
