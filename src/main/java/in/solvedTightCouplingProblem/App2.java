package in.solvedTightCouplingProblem;

public class App2 {
    public static void main(String[] args) {
        Car2 c=new Car2(new PetrolEngine());
        c.drive();
    }
}
//car is extending Engine, car can't extend now wny other class or if modify engine constructor, it will reflect
//this is tight coupling