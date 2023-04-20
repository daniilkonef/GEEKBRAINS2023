/*
    https://gb.ru/lessons/309940/homework
    Урок 7. Двумерные массивы
    Задача 47. Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.
        m = 3, n = 4.
        0,5 7 -2 -0,2
        1 -3,3 8 -9,9
        8 7,8 -7,1 9
 */



using System;


using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mission47
{
    internal class Program
    {
        static void Main()
        {

            Random Generator = new Random();
            double[,] numbers = new double[3,4];

            int countOfRows = numbers.GetLength(0);
            int countOfColumns = numbers.GetLength(1);

            for (int currentColumn = 0; currentColumn < countOfColumns; currentColumn++)
            {
                for (int currentRow = 0; currentRow < countOfRows; currentRow++)
                {
                    numbers[currentRow,currentColumn] = Math.Round(Generator.NextDouble() * 10, 2) ;
                }
            }

            
            foreach (double value in numbers) {Console.WriteLine(value); }


            

            System.Console.WriteLine();
        }
    }
}
