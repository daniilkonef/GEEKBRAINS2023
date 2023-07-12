package ru.gb.daniilkonef;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        String s1 = new String("one");
        String s2 = new String("two");
        String s3 = new String("three");

        LinkedList<String> list = new LinkedList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        list.add(1, "zero");
        list.remove(1);

        System.out.println("Вот такой имеется у нас линкедлист: ");
        System.out.println(list);
        System.out.println("Далее переврачиваю линкедлист встроенным средством: ");
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("Далее переврачиваю линкедлист сам (и создаю новую копию): ");
        System.out.println(getReverseOf(list));



    }

    public static LinkedList<String> getReverseOf(LinkedList<String> list) {
        LinkedList<String> reversedList = new LinkedList<>();
        for (int i = list.size() - 1;
             i >= 0;
             i--) {

            reversedList.add(list.get(i));
        }
        return reversedList;

    }


}






