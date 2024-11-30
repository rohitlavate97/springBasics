package in.looseCouplingSetterMethod;

public class Vehicle {
    private IEngine engine;
    public void setEngine(IEngine engine){
        this.engine=engine;
    }
    public void drive(){
        engine.start();
    }
}
