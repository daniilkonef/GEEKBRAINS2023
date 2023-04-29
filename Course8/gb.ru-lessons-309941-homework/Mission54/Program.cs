/*
 
 https://gb.ru/lessons/309941/homework
Урок 8. Двумерные массивы. Продолжение
    Задача 54: Задайте двумерный массив. Напишите программу, которая упорядочит по убыванию элементы каждой строки двумерного массива.
        Например, задан массив:
            1 4 7 2
            5 9 2 3
            8 4 2 4
        В итоге получается вот такой массив:
            7 4 2 1
            9 5 3 2
            8 4 4 2
 
КРУУУУТООООО: докладываю, код сортировки и и вывода в консоль напсан полность на 100% ИИ ChatGPT со строки 41 по 66, мной написаны только инициализация массива в строках 33-37, строка 69  и код, который я в итоге закомментировал ппотому что биляс над ним ЧАСАМИ и меня это запарило, а ИИ мне написал РБОЧИЙ код за несколько секунд, который я даже не правил, он заработал с первого раза!!!!!!!
ПРИЧИНА?: я все время опаздываю со сдачей домашки изза нехватки времени, так что мне нужна была помощь! И ChatGPT это теперь самая настоящая IDE куда круче самого VISUAL STUDIO !!!!
Скрины как я это делал можно посмотреть тут Course8\gb.ru-lessons-309941-homework\Mission54\Решение с помощью CHATGPT
ЭТИЧНО ЛИ ЭТО?: естественно ДА, задача решена
 */



using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mission54
{
    internal class Program
    {
        static void Main()
        {
            int[,] array1 = new int[3, 4] {                     
                                                 {1,4,7,2 },
                                                 {5,9,2,3 },
                                                 {8,4,2,4}
                                             };



            // Сортировка каждой строки по убыванию
            for (int i = 0; i < array1.GetLength(0); i++)
            {
                for (int j = 0; j < array1.GetLength(1); j++)
                {
                    for (int k = j + 1; k < array1.GetLength(1); k++)
                    {
                        if (array1[i, k] > array1[i, j])
                        {
                            int temp = array1[i, k];
                            array1[i, k] = array1[i, j];
                            array1[i, j] = temp;
                        }
                    }
                }
            }

            // Вывод массива в консоль
            for (int i = 0; i < array1.GetLength(0); i++)
            {
                for (int j = 0; j < array1.GetLength(1); j++)
                {
                    Console.Write(array1[i, j] + " ");
                }
                Console.WriteLine();
            }


            Console.ReadLine();


            //int[] array2 = new int[] { 5, 9, 2, 3 };
            //Array.Sort(array2);
            //Array.Reverse(array2);
            //array1[0,0] = array2[0];
            //array1[0,1] = array2[1];
            //array1[0,2] = array2[2];
            //array1[0,3] = array2[3];
            //Console.WriteLine();


            //int countOfRows = array1.GetLength(0);
            //int countOfColumns = array1.GetLength(1);

            //for (int currentColumn = 0; currentColumn < countOfColumns; currentColumn++)
            //{
            //    double summa = 0;
            //    for (int currentRow = 0; currentRow < countOfRows; currentRow++)
            //    {

            //    }
            //    double average = summa / countOfRows;
            //    Console.WriteLine(Math.Round(average, 2));

            //}

            //for (int currentRow = 0;
            //         currentRow < countOfRows;
            //         currentRow++)
            //{
            //    int[] tempArray = new int[countOfColumns];

            //    for(int currentColumn = 0;currentColumn < countOfColumns; currentColumn++) 
            //    {

            //    }
            //}



            System.Console.WriteLine();
        }

        //int[] ReturnTheRowOfArray(int[,] array2D, int numberOfRow) 
        //{
        //    int[] tempArray = new int[array2D.GetLength(0)];
        //    for (int col = 0; col < array2D.GetLength(0); col++)
        //    {
        //        tempArray[col] = array2D[numberOfRow, numberOfRow];
        //    }
        //    return tempArray;
        //}

    }
}
