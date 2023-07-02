package ru.gb.daniilkonef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> train = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            train.add(new Random().nextInt(100)); // добавляем случайное число от 0 до 99
        }

        Task1.deleteEvenNumber(train);
        System.out.println("min="+Collections.min(train));
        System.out.println("max="+Collections.max(train));

        Task1.getAvg(train);

    }


}






