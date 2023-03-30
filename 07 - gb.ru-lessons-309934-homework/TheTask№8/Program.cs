/*
    https://gb.ru/lessons/309934/homework
    Задача 8: Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N.
    5 -> 2, 4
    8 -> 2, 4, 6, 8

 */


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TheTask_8
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.Write("введите число: ");
                int N = Convert.ToInt32(Console.ReadLine());

                int iteration = 0;
                while (iteration <= N)
                {

                    if (iteration % 2 == 0)
                    {
                        Console.WriteLine($"число: {iteration}");
                    }

                    iteration++;
                }
            }
            
        }
    }
}