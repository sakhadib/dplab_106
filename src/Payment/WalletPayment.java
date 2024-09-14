package Payment;

public class WalletPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Paid Through Digital Wallet!");
    }
}
