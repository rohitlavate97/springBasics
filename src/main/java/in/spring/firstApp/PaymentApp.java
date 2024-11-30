package in.spring.firstApp;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentService pay=new PaymentService(new CreditCardPayment());
        pay.doPayment(100.00);
    }
}
