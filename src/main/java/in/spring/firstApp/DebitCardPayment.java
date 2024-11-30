package in.spring.firstApp;

public class DebitCardPayment implements Ipayment{
    @Override
    public boolean processPayment(double billAmount) {
        System.out.println("Debit card payment successful");
        return true;
    }
}
