/*
 * https://gb.ru/lessons/309934/homework 
 * Задача 2: Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.
 * a = 5; b = 7->max = 7
 * a = 2 b = 10->max = 10
 * a = -9 b = -3->max = -3
 */



using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TheTask_2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true) // запуск бесконечного цикла
            {
                Console.Write("Введите число a =: "); // вывод приглашения ввести число а
                double a = int.Parse(Console.ReadLine()); // преобразование символа типа строка в символ типа челое число 
                Console.Write("Введите число b =: "); // вывод приглашения ввести число b
                double b = int.Parse(Console.ReadLine()); // преобразование символа типа строка в символ типа челое число  

                if (a > b) Console.WriteLine("Число а оказалось больше, чем b;"); //  вывод результата сравнения
                if (b > a) Console.WriteLine("Число b оказалось больше, чем a;"); //  вывод результата сравнения // знаю что вместо еще одного if можно было испольовать else, однако субъективно как я сделал читается лучше, я не люблю отрицающую логику типа "иначе" или "не" - труднее соображать так.
                Console.WriteLine();
            }
            
        }
    }
}
