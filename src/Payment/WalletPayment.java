package Payment;

public class WalletPayment implements Payment{

    public String walletId;
    public int otp;

    public WalletPayment(String walletId, int otp){
        this.walletId = walletId;
        this.otp = otp;
    }
    @Override
    public void pay() {
        System.out.println("Paid Through Digital Wallet!");
    }
}
