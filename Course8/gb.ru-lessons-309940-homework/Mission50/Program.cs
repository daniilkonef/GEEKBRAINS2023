/*
    https://gb.ru/lessons/309940/homework
    Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, и возвращает значение этого элемента или же указание, что такого элемента нет.
        Например, задан массив:
        1 4 7 2
        5 9 2 3
        8 4 2 4
        17 -> такого числа в массиве нет
 */



using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mission50
{
    internal class Program
    {
        static void Main()
        {
            


            
            Random Generator = new Random();
            double[,] arrayOfNumbers = new double[3, 4];

            int countOfRows = arrayOfNumbers.GetLength(0);
            int countOfColumns = arrayOfNumbers.GetLength(1);

            for (int currentColumn = 0; currentColumn < countOfColumns; currentColumn++)
            {
                for (int currentRow = 0; currentRow < countOfRows; currentRow++)
                {
                    arrayOfNumbers[currentRow, currentColumn] = Math.Round(Generator.NextDouble() * 10, 2);
                }
            }


            //foreach (double value in arrayOfNumbers) { Console.WriteLine($"Число {value} находится в координате массива [{}]"); }
            
            for (int currentColumn = 0; currentColumn < countOfColumns; currentColumn++)
            {
                for (int currentRow = 0; currentRow < countOfRows; currentRow++)
                {
                    double value = arrayOfNumbers[currentRow, currentColumn];
                    Console.WriteLine($"Число {value} находится в координате массива [{currentRow},{currentColumn}]");
                    
                }
            }

            Console.WriteLine(); // для красоты


            // ПСЕВДОКОД
            // принять номер строки 
            // принять номер столбца
            // проверить что принятая координата находится внутри размера массива
            // если - нет то  вывести сообщение что такого элемента нет 
            // иначе вывести значение запрошенного элемента

            Console.Write("Сообщите номер строки: ");
            int requestedNumberOfRow = Int32.Parse(Console.ReadLine());

            Console.Write("Сообщите номер столбца: ");
            int requestedNumberOfColumn = Int32.Parse(Console.ReadLine());

            int axisX = 0;
            int axisY = 1;
            countOfRows = arrayOfNumbers.GetLength(axisX);
            countOfColumns = arrayOfNumbers.GetLength(axisY);

            if ( (requestedNumberOfRow <= countOfRows) && (requestedNumberOfColumn <= countOfColumns) )
            {
                double value = arrayOfNumbers[requestedNumberOfRow, requestedNumberOfColumn];
                Console.WriteLine($"В запрошенной координате массива [{requestedNumberOfRow},{requestedNumberOfColumn}] находится число {value} ");
            }
            else Console.WriteLine($"В запрошенной координате массива [{requestedNumberOfRow},{requestedNumberOfColumn}] число отсутствует ");




        }
    }
}
