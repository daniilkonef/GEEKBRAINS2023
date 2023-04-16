/*

    https://gb.ru/lessons/309939/homework
    Задача 43: Напишите программу, которая найдёт точку пересечения двух прямых, 
    заданных уравнениями y = k1 * x + b1, y = k2 * x + b2; значения b1, k1, b2 и k2 задаются пользователем.
    пример: b1 = 2, 
            k1 = 5, 
            b2 = 4, 
            k2 = 9 
            -> (-0,5; -0,5)

    теория найдена тут https://ru.wikipedia.org/wiki/%D0%9F%D0%B5%D1%80%D0%B5%D1%81%D0%B5%D1%87%D0%B5%D0%BD%D0%B8%D0%B5_%D0%BF%D1%80%D1%8F%D0%BC%D1%8B%D1%85#:~:text=%D0%BF%D1%80%D1%8F%D0%BC%D1%8B%D1%85%2C%20%D0%BD%D0%B0%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B5%20%D0%BE%D1%82%D1%80%D0%B5%D0%B7%D0%BA%D0%BE%D0%B2).-,%D0%95%D1%81%D0%BB%D0%B8%20%D0%B7%D0%B0%D0%B4%D0%B0%D0%BD%D1%8B%20%D1%83%D1%80%D0%B0%D0%B2%D0%BD%D0%B5%D0%BD%D0%B8%D1%8F%20%D0%BF%D1%80%D1%8F%D0%BC%D1%8B%D1%85,-%5B%D0%BF%D1%80%D0%B0%D0%B2%D0%B8%D1%82%D1%8C%20%7C
	и тут https://www.interestprograms.ru/source-codes-tochka-peresecheniya-dvuh-pryamyh-na-ploskosti
 */



using System;
namespace TheTask43
{
    internal class Program
    {
        static void Main()
        {
            Console.WriteLine("1я прямая: y = k1*x + b1;");
            Console.WriteLine("2я прямая: y = k2*x + b2;");

            Console.Write("Введите k1: ");
            double k1 = Convert.ToDouble(Console.ReadLine());
            Console.Write("Введите b1: ");
            double b1 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Введите k2: ");
            double k2 = Convert.ToDouble(Console.ReadLine());
            Console.Write("Введите b2: ");
            double b2 = Convert.ToDouble(Console.ReadLine());

            // y = k1 * x + b1
            // y = k2 * x + b2

            // (k1 * x) + b1 = (k2 * x) + b2
            // k1*x - k2*x = b2 - b1
            // x(k1 - k2) = b2 - b1
            // x = (b2 - b1)/(k1 - k2)

            double x = (b2 - b1) / (k1 - k2);
            double y = k1 * x + b1;

            Console.WriteLine($"M({x},{y})");


            // не сказано делать проверку на параллельность и оформлять функции 

        }
    }
}
