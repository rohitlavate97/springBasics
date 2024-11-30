package in.solvedTightCouplingProblem;

public class PetrolEngine implements Engine{
    @Override
    public int start() {
        System.out.println("Petrol Engine Started");
        return 1;
    }
}
