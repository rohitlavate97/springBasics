package in.spring.firstApp;

public class PaymentService {
    Ipayment payment;
    public PaymentService(Ipayment payment){
        this.payment=payment;
    }
    public void doPayment(double billAmt) {
        boolean status = payment.processPayment(billAmt);
        if(status){
            System.out.println("Payment successful");
        }else{
            System.out.println("Payment Declined");
        }
    }
}
