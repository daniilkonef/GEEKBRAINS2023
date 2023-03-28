/*
 * https://gb.ru/lessons/309934/homework#!#s2465
Задача 4: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел
2, 3, 7 -> 7
44 5 78 -> 78
22 3 9 -> 22 
 */



using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TheTask_4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            int[] arr1 = new Int32[99];
            while (true) // запуск бесконечного цикла
            {
                Console.WriteLine();  // вывод пустой строки для отступа
                Console.Write("Введите число a =: ");  // вывод приглашения ввести число а 
                int a = int.Parse(Console.ReadLine()); // преобразование символа типа строка в символ типа челое число 
                
                Console.Write("Введите число b =: ");  // вывод приглашения ввести число b
                int b = int.Parse(Console.ReadLine()); // преобразование символа типа строка в символ типа челое число  
                
                Console.Write("Введите число c =: ");  // вывод приглашения ввести число c 
                int c = int.Parse(Console.ReadLine()); // преобразование символа типа строка в символ типа челое число  

                arr1[0] = a; // присвоил значение переменной а в ячейку 0 массива arr1
                arr1[1] = b; // присвоил значение переменной b в ячейку 1 массива arr1
                arr1[2] = c; // присвоил значение переменной c в ячейку 2 массива arr1 

                int maxValue = arr1.Max(); // нахождение максимальнео числа в массиве чисел 
                Console.WriteLine($"Максимальное числов из веедных Вами равно: {maxValue}"); // Вывод строки при помощи интерполяции строк. Отсюда https://metanit.com/sharp/tutorial/7.5.php

                Console.WriteLine("Нажмите клавишу Enter для повтора.");  // вывод приглашения 
                Console.ReadKey(); // ожидание ввод любой строки и нажатия Enter, это просто нужно чтобы пользователь управлял процессом появления строк на экране 
            }

        }
    }
}
