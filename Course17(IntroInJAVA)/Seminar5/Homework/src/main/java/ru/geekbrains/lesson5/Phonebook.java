package ru.geekbrains.lesson5;

import java.util.HashMap;

public class Phonebook {
    // fields
    private static String[] phonebook = {"700000001 Конев", "700000002 Конев", "700000003 Байраковский", "700000004 Осетров", "700000005 Иванов", "700000006 Волчек", "700000007 Иванов", "700000008 Петрова",};

    Phonebook() {
        HashMap<Integer, String> couple = new HashMap<>();
        for (String person : this.phonebook) {
            String[] parts = person.split(" ");
            couple.put(Integer.parseInt(parts[0]), parts[1]);
        }
        System.out.println("сработал конструктор1");
    }

    public void printBook() {
        System.out.println("Заглушка сработала printBook");
    }
}
