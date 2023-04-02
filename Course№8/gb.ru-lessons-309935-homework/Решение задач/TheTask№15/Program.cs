/*
    Задача 15: Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.
    6 -> да
    7 -> да
    1 -> нет
    * Сделать вариант с использованием конструкции Dictionary
*/




using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TheTask_15
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.Write("введите номер дня недели от 1 до 7: ");
                int n = Convert.ToInt32(Console.ReadLine());
                
                if(Equals(n,1)) 
                {
                    Console.WriteLine($"Цифра {n} соответствует дню недели: ПОНЕДЕЛЬНИК");
                }

                if (Equals(n, 2))
                {
                    Console.WriteLine($"Цифра {n} соответствует дню недели: ВТОРНИК");
                }

                if (Equals(n, 3))
                {
                    Console.WriteLine($"Цифра {n} соответствует дню недели: СРЕДА");
                }

                if (Equals(n, 4))
                {
                    Console.WriteLine($"Цифра {n} соответствует дню недели: ЧЕТВЕРГ");
                }

                if (Equals(n, 5))
                {
                    Console.WriteLine($"Цифра {n} соответствует дню недели: ПЯТНИЦА");
                }

                if (Equals(n, 6))
                {
                    Console.WriteLine($"Цифра {n} соответствует дню недели: СУББОТА");
                }

                if (Equals(n, 7))
                {
                    Console.WriteLine($"Цифра {n} соответствует дню недели: ВОСКРЕСЕНЬЕ");
                }

                if (n<1 || n>7)
                {
                    Console.WriteLine($"Цифра {n} не соответствует никакому дню недели");
                }

                Console.WriteLine();

            }
        }
    }
}
