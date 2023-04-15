/*
    https://gb.ru/lessons/309938/homework
    Задача 38: Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.
    [3 7 22 2 78] -> 76 (этот пример все еще содержит ошибку, несмотря на то что прошло много курсов, похоже преподам все равно на это и они не пишут менеджерам чтоб те исправили - безответственное отношение у преподов)
 */


using System;
using System.Linq;

namespace Mission38
{
    internal class Program
    {
        static void Main(string[] args)
        {
            const byte sizeOfArray = 4; // создаю константу для задания рамера массива 
            double[] array = new Double[sizeOfArray]; // создаю массив заданного размера  
            Random generator = new Random(); // создаю генератор случайных чисел , про окургление ничего не сказано, кстати. 

            int index = 0; // задаю начальный индекс цикла
            foreach (var currentValueOfArray in array) { array[index++] = generator.NextDouble(); } // начинаю перебор массива и сохраняю случайное число в массив по индексу  
            foreach (var currentValueOfArray in array) { Console.WriteLine(currentValueOfArray); } // начинаю перебор массива и вывод на экран каждого его значения  

            Console.WriteLine(String.Empty); // вывожу пустую строку для красоты
            Console.WriteLine($"max {array.Max()}"); // вывожу макс число из массива. кстати, не сказано что нельзя использовать встроенные методы. 
            Console.WriteLine($"min {array.Min()}"); // вывожу мин число из массива
            Console.WriteLine($"max-min={array.Max() - array.Min()}"); // вывожу разницу между макс и мин числами массива , задача решена в этой строке 
            Console.WriteLine(String.Empty); // вывожу пустую строку для красоты

        }

        private static bool IsEvenNumber(int number) { return (number % 2) == 0; } // моя функция/метод для определения четности входного числа 
        private static bool IsOddNumber(int number) { return (number % 2) != 0; } // моя функция/метод для определения не-четности входного числа 
    }
}
