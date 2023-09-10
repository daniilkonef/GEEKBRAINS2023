package Application.Exceptions;

public class IllegalTypeOfPersonsGender extends RuntimeException{
    public IllegalTypeOfPersonsGender() {
        System.out.println("Вы ввели ошибочный пол персоны.");
    }
}
