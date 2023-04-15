/*
    Урок 5. Функции и одномерные массивы 
    Задача 34: Задайте массив заполненный случайными положительными трёхзначными числами. Напишите программу, которая покажет количество чётных чисел в массиве.
        пример: [345, 897, 568, 234] -> 2
        желательно: реалиовать весь код в виде функций!
 */

using System;

namespace Mission34
{
    internal class Program
    {
        static void Main(string[] args)
        {
            const byte sizeOfArray = 4; // создаю константу для задания рамера массива 
            int[] array = new int[sizeOfArray]; // создаю массив аданного размера  
            Random generator = new Random(); // создаю генератор случайных чисел 

            int index = 0; // задаю начальный индекс цикла
            foreach (var value in array) { array[index++] = generator.Next(100, 1000); } // начинаю перебор массива и сохраняю случайное число в массив по индексу  
            foreach (var value in array) { Console.WriteLine(value); } // начинаю перебор массива и вывод на экран каждого его значения  

            
            byte amountOfEvenNumbers = 0; // создаю ячейку для хранения количества четных чисел
            foreach (var value in array) // обход всего массива чисел
            {
                if (IsEvenNumber(value)) amountOfEvenNumbers++; // если ззначение окажется четным то увеличится счетчик
            }
            
            Console.WriteLine(amountOfEvenNumbers); // после всех вычислений вывести кол-во четных значений в масссиве 
        }
        
        private static bool IsEvenNumber(int number) { return (number % 2) == 0; } // моя функция/метод для определения четности входного числа 
    }
}
