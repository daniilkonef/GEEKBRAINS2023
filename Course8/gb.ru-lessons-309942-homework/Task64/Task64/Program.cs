/*

https://gb.ru/lessons/309942/homework
Урок 9. Рекурсия
    Задача 64: Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от N до 1. Выполнить с помощью рекурсии.
        N = 5 -> "5, 4, 3, 2, 1"
        N = 8 -> "8, 7, 6, 5, 4, 3, 2, 1"

 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task64
{
    internal class Program
    {
        static void Main()
        {
            PrintNaturalRangeDownFrom(8);
        }

        static void PrintNaturalRangeDownFrom(int number) 
        {
            if (number == 0) return;
                else
                {
                    Console.WriteLine(number);
                    PrintNaturalRangeDownFrom(number - 1);
                }

        }
    }
}
