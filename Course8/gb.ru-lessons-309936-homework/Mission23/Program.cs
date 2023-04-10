
/*
    https://gb.ru/lessons/309936/homework
    Задача 23  - Напишите программу, которая принимает на вход число (N) и выдаёт таблицу кубических чисел от 1 до N. 
        3 -> 1, 8, 27
        5 -> 1, 8, 27, 64, 125
        * Вывести таблицу с границами и значениями друг над другом

 */


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mission23
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Int32 N = 0;
                Console.Write("Введите число N: "); // вывожу приглашение пользователю 
                N = Convert.ToInt32(Console.ReadLine()); // читаю текстовый ввод пользователя и преобразовываю его в целое число 

                for (int i = 1; i <= N; i++)
                {
                    Console.WriteLine(i*i*i);
                }
                Console.WriteLine();

   
            }
        }
    }
}
