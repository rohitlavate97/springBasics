package in.spring.firstApp;

public class SodexoPayment implements Ipayment{
    @Override
    public boolean processPayment(double billAmount) {
        System.out.println("Sodexo voucher Payment Successful");
        return true;
    }
}
