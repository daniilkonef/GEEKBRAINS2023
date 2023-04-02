/*
 * https://gb.ru/lessons/309935/homework
 * Задача 10: Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа.
 * Например 456-> 5;
 * Например 782 -> 8;
 * Например 918 -> 1;
 *
 */









using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TheTask_10
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.Write("введите трехзначное число: ");
                int NNN = Convert.ToInt32(Console.ReadLine());
                int NN = NNN / 10; // тут я отбросил третью цифру трехзначного цисла (при счете слева направо), было например 857, а осталось 85;
                int N = NN % 10; // тут я отбросил первую цифру трехзначного цисла (при счете слева направо), было напрример 85, а осталось 5;
                Console.WriteLine($"вторая цифра введенного числа, это: {N}");
                Console.WriteLine();


                //int iteration = 0;
                //while (iteration <= N)
                //{

                //    if (iteration % 2 == 0)
                //    {
                //        Console.WriteLine($"число: {iteration}");
                //    }

                //    iteration++;
                //}
            }
        }
    }
}
