/*
    https://gb.ru/lessons/309937/homework
    Знакомство с языками программирования (семинары) - Урок 4. Функции
    Задача 25: Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.
    3, 5 -> 243 (3⁵)
    2, 4 -> 16
 */





using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mission25
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

                Console.Write("Введите число B: "); // вывожу приглашение пользователю 
                B = Convert.ToInt32(Console.ReadLine()); // читаю текстовый ввод пользователя и преобразовываю его в целое число 

                Int32 C = A;
                for (int i = 2; 
                     i <= B; 
                     i++)
                {
                    C = C*A;
                }

                Console.WriteLine(C);
                Console.ReadLine();

            }
            
        }
    }
}
