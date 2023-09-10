package Application.Exceptions;

public class IllegalAmountOfPersonsFeatures extends RuntimeException{
    public IllegalAmountOfPersonsFeatures() {
        System.out.println("Вы ввели ошибочное количество параметров персоны.");
    }
}
