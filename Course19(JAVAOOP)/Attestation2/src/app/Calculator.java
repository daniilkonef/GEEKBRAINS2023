package app;

public final class Calculator implements Calculable {

    private int x;

    public Calculator(int x) { // constructor
        this.x = x;
    }

    @Override
    public Calculable summarize(int y) { // method
        x += y;
        Calculator calculator = this;
        return calculator;
    }

    @Override
    public Calculable multiply(int y) { // method
        x *= y;
        Calculator calculator = this;
        return calculator;
    }

    @Override
    public int getResult() { // method
        return x;
    }
}
