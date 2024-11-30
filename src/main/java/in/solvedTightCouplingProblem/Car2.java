package in.solvedTightCouplingProblem;

public class Car2 {
    Engine engine; //this is again tight coupling, we need to change the car class
    public Car2(Engine engine){
        this.engine=engine;
    }
    public void drive(){
        int status= engine.start();
        if(status>=1){
            System.out.println("Journey started");
        }else{
            System.out.println("Engine problem");
        }
    }
}
