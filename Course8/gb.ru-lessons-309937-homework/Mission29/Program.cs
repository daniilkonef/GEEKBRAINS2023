/*
    https://gb.ru/lessons/309937/homework
    Задача 29: Напишите программу, которая задаёт массив из 8 элементов и выводит их на экран.
    пример 1, 2, 5, 7, 19 -> [1, 2, 5, 7, 19]
    пример 6, 1, 33 -> [6, 1, 33]

 */


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mission29
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] trains = { 1, 2, 3, 4, 5, 6, 7, 8 };
            foreach (int part in trains)
            {
                Console.WriteLine($"число: {part}"); // 
            }

            Console.ReadLine();



        }
    }
}
