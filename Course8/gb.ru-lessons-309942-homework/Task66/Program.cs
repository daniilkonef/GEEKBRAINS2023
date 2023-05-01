/*
    https://gb.ru/lessons/309942/homework
    Задача 66: Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных чисел в промежутке от M до N при помощи рекурсии.
    M = 1; N = 15 -> 120 // =1+2+3+4+5+6+7+8+9+10+11+12+13+14+15 = 120
    M = 1; N = 3 -> 6 // =1+2+3=6
    M = 4; N = 8. -> 30
 */


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task66 // решено самостоятельно на основе https://metanit.com/sharp/tutorial/2.11.php
{
    internal class Program
    {
        static void Main()
        {
            int M = 4; // start
            int N = 8; // end 

            Console.WriteLine(Summarial(M,N));

        }
        static int Summarial(int start, int end)
        {

            if (end == 1) return 1; 
            if (end == start) return start;
            else return end + Summarial(start, end-1); 

        }
    }
}
