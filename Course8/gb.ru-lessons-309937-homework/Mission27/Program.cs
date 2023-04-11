/*
    https://gb.ru/lessons/309937/homework    
    Задача 27: Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе
    пример: 452 -> 11,
    пример: 82 -> 10,
    пример: 9012 -> 12.
 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mission27
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {

                Int32 A = 0;
                Int32 B = 0;
                

                Console.Write("Введите число A: "); // вывожу приглашение пользователю 
                A = Convert.ToInt32(Console.ReadLine()); // читаю текстовый ввод пользователя и преобразовываю его в целое число 


                while( (A%10) > 0 || (A > 0) )
                {

                    B = B + A % 10;
                    A = A / 10;
                    
                }

                Console.WriteLine($"Сумма цифр в числе равна {B}");
                Console.WriteLine();
                

            }
        }
    }
}
