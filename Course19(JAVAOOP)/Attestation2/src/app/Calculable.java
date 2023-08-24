package app;

public interface Calculable {
    Calculable summarize(int arg);

    Calculable multiply(int arg);

    int getResult();
}
