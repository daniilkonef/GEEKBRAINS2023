// https://gb.ru/lessons/340466/homework
// 3) Реализовать простой калькулятор

package ru.gb.daniilkonef.homework1;
import java.util.Scanner;

public class Task3 {
    static Scanner scanner = new Scanner(System.in);
    public static void simpleCalculator(){
        System.out.println("ВЫ ЗАПУСТИЛИ ОЧЕНЬ ПРОСТОЙ КАЛЬКУЛЯТОР");
        System.out.print("Введите число x1 = ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите число x2 = ");
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("ТЕПЕРЬ НУЖНО ВЫБРАТЬ ОПЕРАЦИЮ:");
        System.out.println("Введите 1 и нажмите Enter, если желаете выполнить суммирование введенных чисел;");
        System.out.println("Введите 2 и нажмите Enter, если желаете выполнить вычитание x1 - x2 = ;");

        switch (userChoice) {
            case 1:
        }

        System.out.println(num1+num2);
    }

    public static void run(){
        simpleCalculator();
    }

}
