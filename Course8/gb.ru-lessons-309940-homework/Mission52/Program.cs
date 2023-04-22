/*
    https://gb.ru/lessons/309940/homework
    Задача 52. 
            1. Задайте двумерный массив из целых чисел.    
            2. Найдите среднее арифметическое элементов в каждом столбце.
    
    Например, задан массив:
                            1 4 7 2
                            5 9 2 3
                            8 4 2 4
    Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3.
*/


using System;

namespace Mission52
{
    internal class Program
    {
        static void Main()
        {
            int[,] arrayOfInt = new int[3,4] { 
                                                 {1,4,7,2 },
                                                 {5,9,2,3 },
                                                 {8,4,2,4} 
                                             };


            int countOfRows = arrayOfInt.GetLength(0);
            int countOfColumns = arrayOfInt.GetLength(1);

            for (int currentColumn = 0; currentColumn < countOfColumns; currentColumn++)
            {
                double summa = 0;
                for (int currentRow = 0; currentRow < countOfRows; currentRow++)
                {
                    summa = arrayOfInt[currentRow, currentColumn] + summa;
                }
                double average = summa / countOfRows;
                Console.WriteLine(Math.Round(average, 2));
                
            }


            System.Console.WriteLine();
        }
    }
}
