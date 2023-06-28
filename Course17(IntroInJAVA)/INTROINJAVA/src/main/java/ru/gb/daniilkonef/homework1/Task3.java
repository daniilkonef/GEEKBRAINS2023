// https://gb.ru/lessons/340466/homework
// 3) Реализовать простой калькулятор

package ru.gb.daniilkonef.homework1;
import java.util.Scanner;

public class Task3 {
    static Scanner scanner = new Scanner(System.in);
    public static void simpleCalculator(){
        System.out.println("ВЫ ЗАПУСТИЛИ ОЧЕНЬ ПРОСТОЙ КАЛЬКУЛЯТОР");
        System.out.print("Введите число x1 = ");
        double x1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Введите число x2 = ");
        double x2 = Double.parseDouble(scanner.nextLine());

        System.out.println();
        System.out.println("ТЕПЕРЬ НУЖНО ВЫБРАТЬ ОПЕРАЦИЮ:");
        System.out.println("Введите знак + и нажмите Enter, если желаете выполнить x1 + x2 = ;");
        System.out.println("Введите знак - и нажмите Enter, если желаете выполнить x1 - x2 = ;");
        System.out.println("Введите знак / и нажмите Enter, если желаете выполнить x1 / x2 = ;");
        System.out.println("Введите знак * и нажмите Enter, если желаете выполнить x1 * x2 = ;");

        String userChoice = scanner.nextLine();

        if (userChoice.contains("+")) System.out.println("Результат x1 + x2 = " + Double.toString(x1+x2));
        if (userChoice.contains("-")) System.out.println("Результат x1 - x2 = " + Double.toString(x1-x2));
        if (userChoice.contains("/")) System.out.println("Результат x1 / x2 = " + Double.toString(x1/x2));
        if (userChoice.contains("*")) System.out.println("Результат x1 * x2 = " + Double.toString(x1*x2));

        System.out.println();





    }

    public static void run(){
        simpleCalculator();
    }

}
