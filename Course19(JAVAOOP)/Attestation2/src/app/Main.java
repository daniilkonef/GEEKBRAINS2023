package app;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        View view = new View(calculableFactory);
        view.run();
    }
}
