package ru.geekbrains.lesson6;

import java.util.*;

/**
 * Задание
 * +1) Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
 * +2) Поместите в него некоторое количество объектов. (видимо - котов)
 * +3) Создайте 2 или более котов с одинаковыми параметрами в полях.
 * +4) Поместите их во множество. Убедитесь, что все они сохранились во множество.
 * +5) Создайте метод  public boolean equals(Object o)
 * +6) Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
 * должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
 * +7) Создайте метод  public int hashCode() который будет возвращать hash, вычисленный на основе
 * полей класса Cat. (Можно использовать Objects.hash(...))
 * +8) Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
 * ГОТОВО: работает
 */

public class Program {

    private static Random random = new Random();

    public static void main(String[] args) {

        Cat cat1 = new Cat(1, 4, 1);
        Cat cat2 = new Cat(2, 6, 2);
        Cat cat3 = new Cat(2, 6, 2);
        System.out.println("Object1=" + cat1);
        System.out.println("Object2=" + cat2);
        System.out.println("Object3=" + cat3);

        HashSet<Cat> catSet1 = new HashSet<>();
        catSet1.add(cat1);
        catSet1.add(cat2);
        catSet1.add(cat3);
        System.out.println("catSet=" + catSet1);
    }


}

