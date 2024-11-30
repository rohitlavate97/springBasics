package in.looseCouplingSetterMethod;

public class DieselE implements IEngine{
    @Override
    public int start() {
        System.out.println("Diesel Engine Started");
        return 1;
    }
}
