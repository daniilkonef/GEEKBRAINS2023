package ru.gb.daniilkonef;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void deleteEvenNumber(ArrayList<Integer> train){
        System.out.println("Список чисел до удаления четных чисел: " + train);

        for (int i = 0; i < train.size(); i++) {
            if (train.get(i) % 2 == 0) {
                train.remove(i);
                i--;    // мои мозга закипели пока я придумал этот самый эффектиынй шаг, думал уже повторные циклы вводить или рекурсию вспоминать, а вот это уже было бы низкоэффективно...!!
            }
        }

        System.out.println("Список после удаления четных чисел: " + train);


    }

    public static void getAvg(ArrayList<Integer> train){

        int sum = 0;
        for (int num : train) {
            sum += num;
        }
        int avg = sum / train.size();
        System.out.println("avg="+avg);

    }


}
