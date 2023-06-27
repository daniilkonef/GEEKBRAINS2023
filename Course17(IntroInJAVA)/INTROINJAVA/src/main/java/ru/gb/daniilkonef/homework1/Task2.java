// https://gb.ru/lessons/340466/homework
// 2) Вывести все простые числа от 1 до 1000

package ru.gb.daniilkonef.homework1;
import java.util.stream.IntStream;

public class Task2 {
    public static void showSimpleNumber() {
        boolean flag = true;
        for (int P = 1; P <= Integer.MAX_VALUE; P++) {
            if (P==1) {
                System.out.println(P);
                continue;
            }            ;
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.print(P+"->");
            else flag = true;
            if (P >= 1000) break;
        }
    }

    public static void run(){
        showSimpleNumber();
    }
}
