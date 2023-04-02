/*

https://gb.ru/lessons/309934/homework 
Задача 6: Напишите программу, которая на вход принимает число и выдаёт, является ли число чётным (делится ли оно на два без остатка).
4 -> да
-3 -> нет
7 -> нет

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace TheTask_6
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int a;
            while (true)
            {
                
                Console.Write("введите число: ");
                a = Convert.ToInt32(Console.ReadLine());

                if (a % 2 == 1)
                {
                    Console.WriteLine("число нечетное");

                }
                else
                {
                    Console.WriteLine("Число четное");
                }

                //Console.ReadKey();
            }

        }
    }
}
