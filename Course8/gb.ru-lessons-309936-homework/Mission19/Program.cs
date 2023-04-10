/*
https://gb.ru/lessons/309936/homework 
Урок 3. Базовые алгоритмы. Продолжение
    Задача 19 - Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом.
    14212 -> нет
    12821 -> да
    23432 -> да
СЛОЖНЫЙВАРИАНТ: Сделать вариант через СЛОВАРЬ четырехзначных палиндромов
 */


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mission19
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true) // запускаю бесконечный цикл работы приложения 
            {
                Console.Write("Введите 5-значное целое число: "); // вывожу приглашение пользователю 
                string txt1 = Console.ReadLine();
                int num = Convert.ToInt32(txt1); // читаю текстовый ввод пользователя и преобразовываю его в целое число 

                if ( (num < 10_000) || (num > 99_999) )
                {
                    Console.WriteLine("Вы ввели не 5-значное число. Давайте попробуем еще раз."); continue;
                }
                
                char[] chars = txt1.ToCharArray();
                Array.Reverse(chars);
                string txt2 = new string(chars);

                
                if (Equals(txt1, txt2)) // сравниваю это число с единицей
                {
                    Console.WriteLine($"Да, цифра {num} является полиндромом!"); // вывожу очевидное сообщение пользователю
                }
                else Console.WriteLine($"Нет, цифра {num} не является полиндромом!"); // вывожу очевидное сообщение пользователю


                Console.WriteLine(); // вывожу пустую строку для красоты, красотище теперь! 

            }
        }
    }
}
