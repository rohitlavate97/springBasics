package in.inheritanceTightCoupling;

public class App1 {
    public static void main(String[] args) {
        Car1 c=new Car1();
        c.drive();
    }
}
//car is extending Engine, car can't extend now wny other class or if modify engine constructor, it will reflect
//this is tight coupling