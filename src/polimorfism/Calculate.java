package polimorfism;

public class Calculate {
    public static double execute(IOperation operation, Double a, Double b) {
        return operation.operate(a,b);
    }
}
