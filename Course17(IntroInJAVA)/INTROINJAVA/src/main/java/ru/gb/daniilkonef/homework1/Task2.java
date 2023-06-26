package ru.gb.daniilkonef.homework1;

import java.util.stream.IntStream;

public class Task2 {
    public static void showSimpleNumber() {
        boolean flag = true;
        boolean b = true;
        for (int P = 2; P <= 100; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.print(P+" ");
            else b = true;
        }
    }

    public static void run(){
        showSimpleNumber();
    }
}
