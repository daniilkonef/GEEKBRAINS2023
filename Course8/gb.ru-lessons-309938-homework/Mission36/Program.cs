/*
    https://gb.ru/lessons/309938/homework
    Задача 36: Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.
        [3, 7, 23, 12] -> 19
        [-4, -6, 89, 6]-> 0
*/

using System;

namespace Mission36
{
    internal class Program
    {
        static void Main(string[] args)
        {
            const byte sizeOfArray = 4; // создаю константу для задания рамера массива 
            int[] array = new int[sizeOfArray]; // создаю массив заданного размера  
            Random generator = new Random(); // создаю генератор случайных чисел 

            int index = 0; // задаю начальный индекс цикла
            foreach (var currentValueOfArray in array) { array[index++] = generator.Next(-10, 10+1); } // начинаю перебор массива и сохраняю случайное число в массив по индексу  
            foreach (var currentValueOfArray in array) { Console.WriteLine(currentValueOfArray); } // начинаю перебор массива и вывод на экран каждого его значения  

            int sumOfOddNumbers = 0; // создаю ячейку для хранения суммы не-четных чисел   
            
            index = 0; // задаю начальный индекс цикла
            foreach (var currentValueOfArray in array) // обход всего массива чисел
            {
                if (IsOddNumber(index)) sumOfOddNumbers = currentValueOfArray + sumOfOddNumbers; // если ззначение окажется не-четным то увеличится счетчик суммы чисел
                index++; // увеличиваю индекс цикла 
            }

            Console.WriteLine($"Сумма {sumOfOddNumbers}"); // после всех вычислений вывести сумму чисел в масссиве стоящих на не-четном индексе
        }

        private static bool IsEvenNumber(int number) { return (number % 2) == 0; } // моя функция/метод для определения четности входного числа 
        private static bool IsOddNumber(int number) { return (number % 2) != 0; } // моя функция/метод для определения не-четности входного числа 
    }
}
