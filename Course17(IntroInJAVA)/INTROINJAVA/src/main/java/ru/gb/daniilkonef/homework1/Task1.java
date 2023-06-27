// https://gb.ru/lessons/340466/homework
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package ru.gb.daniilkonef.homework1;

public class Task1 {
    public static int getTriangularNumber(int number){
        int n = number;
        double Tn = n*(n+1)*0.5;
        return (int)(Tn);
    }

    public static void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Task1.getTriangularNumber(i));
        }
    }
}
