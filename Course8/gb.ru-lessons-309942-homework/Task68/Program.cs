/*
    https://gb.ru/lessons/309942/homework
    Задача 68: Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n.
    m = 2, n = 3 -> A(m,n) = 9
    m = 3, n = 2 -> A(m,n) = 29 
 */



using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task68
{
    internal class Program
    {
        public static int Ackermann(int m, int n)
        {
            // Базовый случай, если m = 0, возвращаем n + 1
            if (m == 0)
            {
                return n + 1; // выход из рекурсии
            }
            // Базовый случай, если n = 0, вызываем рекурсивно Ackermann(m-1, 1)
            else if (n == 0)
            {
                return Ackermann(m - 1, 1); // вызов функции с m-1 и n=1
            }
            // Рекурсивный случай, вызываем Ackermann(m-1, Ackermann(m, n-1))
            else
            {
                return Ackermann(m - 1, Ackermann(m, n - 1)); // рекурсивный вызов Ackermann
            }
        }

        static void Main()
        {
            Console.WriteLine(Ackermann(3, 2)); // выводим значение функции Аккермана с m=3 и n=4
        }
    }
}



