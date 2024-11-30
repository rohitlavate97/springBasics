package in.looseCouplingSetterMethod;

public class PetrolE implements IEngine{
    @Override
    public int start() {
        System.out.println("Petrol Engine Started");
        return 1;
    }
}
