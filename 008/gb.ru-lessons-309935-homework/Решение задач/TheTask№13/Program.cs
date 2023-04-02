/*  https://gb.ru/lessons/309935/homework
 *  Задача 13: Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.
 *  645-> 5
 *  78-> третьей цифры нет
 *  32679-> 6
 *  *Сделать вариант для числа длиной до 10 цифр не используя char или string
 */



using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TheTask_13
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.Write("Введите число от 100 и выше: ");
                int NNN = Convert.ToInt32(Console.ReadLine());

                if (NNN < 100)
                {
                    Console.WriteLine("Вы ввели число меньше 100, третьей цифры тут нет. Попробуем заново.");
                    Console.WriteLine();
                    continue;
                }
                
                if (NNN >= 100 && NNN <= 999) 
                {
                    int N3 = NNN % 10; // тут я взял 3ю цифру трехзначного цисла (3ю при счете слева направо), было напрример 123, а осталось 3;
                    Console.WriteLine($"3я цифра введенного числа, это: {N3}");
                    Console.WriteLine();
                }

                if (NNN > 999)
                {
                    Console.WriteLine("Вы ввели число больше 999, эта версия ПО не обрабатывает такие числа. Попробуем заново.");
                    Console.WriteLine();
                    continue;
                }





            }
        }
    }
}
