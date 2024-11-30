package in.constructorTightCouplling;

public class App {
    public static void main(String[] args) {
        Car c=new Car();
        c.drive();
    }
}
//changes in the engine constructor also require changes in the car, tight coupling