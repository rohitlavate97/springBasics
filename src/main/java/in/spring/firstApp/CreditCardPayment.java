package in.spring.firstApp;

public class CreditCardPayment implements Ipayment{
    @Override
    public boolean processPayment(double billAmount) {
        System.out.println("Credit Card Payment Successful");
        return true;
    }
}
