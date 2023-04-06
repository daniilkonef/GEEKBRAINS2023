/*

    https://gb.ru/lessons/309936/homework
    Задача 21 - Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 3D пространстве.
        A (3,6,8); B (2,1,-7), -> 15.84
        A (7,-5, 0); B (1,-1,9) -> 11.53

 */




using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mission21
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                double x1 = +7;
                double y1 = -5;
                double z1 = +0;
                double x2 = +1;
                double y2 = -1;
                double z2 = +9;

                Console.Write("Введите число x1: "); // вывожу приглашение пользователю 
                x1 = Convert.ToInt32(Console.ReadLine()); // читаю текстовый ввод пользователя и преобразовываю его в целое число 

                Console.Write("Введите число y1: "); // вывожу приглашение пользователю 
                y1 = Convert.ToInt32(Console.ReadLine()); // читаю текстовый ввод пользователя и преобразовываю его в целое число 

                Console.Write("Введите число z1: "); // вывожу приглашение пользователю 
                z1 = Convert.ToInt32(Console.ReadLine()); // читаю текстовый ввод пользователя и преобразовываю его в целое число 

                Console.Write("Введите число x2: "); // вывожу приглашение пользователю 
                x2 = Convert.ToInt32(Console.ReadLine()); // читаю текстовый ввод пользователя и преобразовываю его в целое число 

                Console.Write("Введите число y2: "); // вывожу приглашение пользователю 
                y2 = Convert.ToInt32(Console.ReadLine()); // читаю текстовый ввод пользователя и преобразовываю его в целое число 

                Console.Write("Введите число z2: "); // вывожу приглашение пользователю 
                z2 = Convert.ToInt32(Console.ReadLine()); // читаю текстовый ввод пользователя и преобразовываю его в целое число 

                distance(x1, y1, z1, x2, y2, z2);
            }

        }

        static void distance(double x1, double y1, double z1, double x2, double y2, double z2)
        {
            double d = Math.Pow((Math.Pow(x2 - x1, 2) + Math.Pow(y2 - y1, 2) + Math.Pow(z2 - z1, 2) * 1.0), 0.5);
            Console.WriteLine($"Расстояние {Math.Round(d,2)}");
            Console.ReadLine();
        }
    }
}
