package ru.geekbrains.lesson5;

public class Program {
    public static void main(String[] args) {
        Phonebook book1 = new Phonebook();
        book1.get("Конев");
        book1.add(1953, "Сталин");
        book1.get("Сталин");
    }
}

