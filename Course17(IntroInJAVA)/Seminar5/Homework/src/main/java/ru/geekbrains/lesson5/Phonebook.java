package ru.geekbrains.lesson5;

import java.util.HashMap;
import java.util.Map;

/**
 * * Задача:
 * Написать простой класс Телефонный Справочник (с помощью HashMap), который хранит в себе список фамилий и
 * телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи,
 * а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией
 * может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
 * выводиться все телефоны.
 */

public class Phonebook {
    private HashMap<Integer, String> couple = new HashMap<>();

    // fields
    private static String[] defaultbook = {"700000001 Конев", "700000002 Конев", "700000003 Байраковский", "700000004 Осетров", "700000005 Иванов", "700000006 Волчек", "700000007 Иванов", "700000008 Петрова", "700000009 Петрова",};

    Phonebook() {
        //HashMap<Integer, String> couple = new HashMap<>();
        for (String person : this.defaultbook) {
            String[] parts = person.split(" ");
            this.couple.put(Integer.parseInt(parts[0]), parts[1]);
        }

    }

    public void get(String lastName) {
        for (Map.Entry<Integer, String> element : this.couple.entrySet()) {
            if (element.getValue().equals(lastName))
                System.out.printf("Персона: %s, телефон: " + element.getKey() + "; \n", lastName);
        }
    }

    public void add(int phoneNumber, String lastName) {
        this.couple.put(phoneNumber, lastName);
    }
}
