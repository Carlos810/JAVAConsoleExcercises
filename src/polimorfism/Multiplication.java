package polimorfism;

public class Multiplication implements IOperation{

    @Override
    public double operate(double a, double b) {
        return (a*b);
    }
}
