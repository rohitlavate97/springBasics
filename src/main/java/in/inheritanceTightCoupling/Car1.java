package in.inheritanceTightCoupling;

public class Car1 extends Engine1 {
    public void drive(){
        int status=super.start();
        if(status>=1){
            System.out.println("Journey started");
        }else{
            System.out.println("Engine problem");
        }
    }
}
