package in.looseCouplingSetterMethod;

public class AppSet {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.setEngine(new DieselE());
        v.drive();
    }
}
//injecting dependent object into the target object
//c.eng=new PetrolEng();  this is the field injection