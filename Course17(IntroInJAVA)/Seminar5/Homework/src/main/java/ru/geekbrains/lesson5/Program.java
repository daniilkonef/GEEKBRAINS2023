package ru.geekbrains.lesson5;

import java.util.*;

public class Program {

    public static void main(String[] args) {
        /**
         * Задача:
         Написать простой класс Телефонный Справочник (с помощью HashMap), который хранит в себе список фамилий и
         телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи,
         а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией
         может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
         выводиться все телефоны.
         */

//        String[] phonebook = {
//                "700000001 Конев",
//                "700000002 Конев",
//                "700000003 Байраковский",
//                "700000004 Осетров",
//                "700000005 Иванов",
//                "700000006 Волчек",
//                "700000007 Иванов",
//                "700000008 Петрова",
//        };

//        start(phonebook);
        Phonebook book1 = new Phonebook();
        book1.printBook();
    }
}


//    public static void start(String[] data) {
//        HashMap<Integer, String> couple = new HashMap<>();
//
//        for (String person : data) {
//            String[] parts = person.split(" ");
//            couple.put(Integer.parseInt(parts[0]), parts[1]);
//        }
//
//        for (Map.Entry<Integer, String> element : couple.entrySet()) {
//            if (element.getValue().equals("Иванов"))
//                System.out.println(element.getKey());
//        }


// Способ 2
//        HashMap<String, List<Integer>> hashMap2 = new HashMap<>();
//        for (String person : data) {
//            String[] parts = person.split(" ");
//
//            if (hashMap2.containsKey(parts[1])) {
//                List<Integer> lst = hashMap2.get(parts[1]);
//                lst.add(Integer.parseInt(parts[0]));
//                hashMap2.get(parts[1]).add(Integer.parseInt(parts[0]));
//
//            } else {
//                ArrayList<Integer> lst = new ArrayList<>();
//                lst.add(Integer.parseInt(parts[0]));
//                hashMap2.put(parts[1], lst);
//            }
//        }
//
//        List<Integer> lst = hashMap2.get("Иванов");
//        if (lst != null) {
//            System.out.println(lst);
//        }
//
//    }
//
//}
