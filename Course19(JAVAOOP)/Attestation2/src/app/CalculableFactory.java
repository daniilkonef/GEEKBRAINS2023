package app;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int x) {
        return new Calculator(x);
    }
}
