/*
https://gb.ru/lessons/309939/homework
Знакомство с языками программирования (семинары)
Урок 6. Одномерные массивы. Продолжение 
Задача 41: Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.
    0, 7, 8, -2, -2 -> 2
    1, -7, 567, 89, 223-> 3
 */


using System;
namespace TheTask41
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            int amountOfNumbersAboveZero=0;
            while (true)
            {
                Console.Write("Введите число: ");
                int numberFromUser = int.Parse(Console.ReadLine()); // исключения мы не проходили и проверку делать не было сказано 
                if (numberFromUser > 0) amountOfNumbersAboveZero++;
                Console.WriteLine($"Кол-во чисел больше 0, которые вы ввели: {amountOfNumbersAboveZero}");
                Console.WriteLine(String.Empty);
            }
        }
    }
}
