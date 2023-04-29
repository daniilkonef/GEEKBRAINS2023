﻿/*
 https://gb.ru/lessons/309941/homework
Задача 56: Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку с наименьшей суммой элементов.
    Например, задан массив:
        1 4 7 2
        5 9 2 3
        8 4 2 4
        5 2 6 7
    Программа считает сумму элементов в каждой строке и выдаёт номер строки с наименьшей суммой элементов: 1 строка  // КОНЕВ: тут у вас либо ошибка либо вы забыли что нумерация у программистов начинается с нуля
 */


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mission56
{
    internal class Program
    {
        static void Main() // 
        {
            int[,] array4x4 = new int[4, 4] { // написано мной
                                                 {1,4,7,2 }, // 14 // написано мной
                                                 {5,9,2,3 }, // 19 // написано мной
                                                 {8,4,2,4}, // 18 // написано мной
                                                 {5,2,6,7 } // 20 // написано мной
                                          }; // написано мной

            // студент Д.КОНЕВ: начиная отсюда безошибочный код написан на 100% ИИ CHATGPT и комменнтарии на русском языке тоже написаны им же!!! аааа!!!
            int minSumRowIndex = 0;  // переменная, в которой будем хранить индекс строки с наименьшей суммой элементов, изначально равна 0
            int minSumRowSum = int.MaxValue;  // переменная, в которой будем хранить значение наименьшей суммы элементов, изначально равна максимальному значению типа int

            for (int i = 0; i < array4x4.GetLength(0); i++)  // цикл по строкам массива (i - индекс строки)
            {
                int rowSum = 0;  // переменная, в которой будем хранить сумму элементов текущей строки, изначально равна 0
                for (int j = 0; j < array4x4.GetLength(1); j++)  // цикл по столбцам массива (j - индекс столбца)
                {
                    rowSum += array4x4[i, j];  // добавляем текущий элемент массива к сумме элементов строки
                }
                if (rowSum < minSumRowSum)  // если сумма элементов текущей строки меньше, чем значение наименьшей суммы элементов, которое мы нашли ранее
                {
                    minSumRowIndex = i;  // обновляем переменную с индексом строки с наименьшей суммой элементов
                    minSumRowSum = rowSum;  // обновляем переменную с наименьшей суммой элементов
                }
            }

            Console.WriteLine("Номер строки с наименьшей суммой элементов: " + minSumRowIndex);  // выводим в консоль номер строки с наименьшей суммой элементов
            // студент Д.КОНЕВ: и заканчивая тут безошибочный код написан на 100% ИИ CHATGPT и комменнтарии на русском языке тоже написаны им же!!! аааа!!!


            Console.WriteLine("Автор 99% кода и русскоязычных комментариев: AI CHATGPT"); // а этой мой вывод, теперь этот ИИ - мой лучший друг!.
            

        }
    }
}
