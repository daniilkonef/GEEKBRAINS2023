// https://gb.ru/lessons/340467/homework
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package ru.gb.daniilkonef.homework2;


import java.util.Arrays;
import java.io.*;

public class Task2 {
    static final String filePathName ="src/main/java/ru/gb/daniilkonef/homework2/log.txt";
    public static void run() {


        deleteLog(filePathName);
        int[] train = {7, 65, 4, -2, 3, 8, 9, 1};
        bubbleSort(train);
        System.out.println();
        System.out.println("Итог сортировки: " + Arrays.toString(train));
    }

    public static void bubbleSort(int[] train) {
        String text = null;

        for (int i = 0; i < train.length - 1; i++) {

            text = "Имеем массив: " + Arrays.toString(train);
            System.out.println(text);
            writeToLog(text, filePathName);

            text = "\nНачало итерации: " + i;
            System.out.println(text);
            writeToLog(text, filePathName);

            for (int j = 0; j < train.length - i - 1; j++) {
                text = "i[" + i + "]=" + train[i] + " " + "j[" + j + "]=" + train[j] + " было до перестановки";  // в отличие от C# в JAVA ооочень неудобная интерполяция строк поэтому не хочу даже заморчаиваться делать эту интерполяцию, пусть вместо меня процессор напрягается
                System.out.println(text);
                writeToLog(text, filePathName);

                if (train[j] > train[j + 1]) {
                    int temp = train[j];
                    train[j] = train[j + 1];
                    train[j + 1] = temp;

                }

                text = ("i[" + i + "]=" + train[i] + " " + "j[" + j + "]=" + train[j] + " стало после перестановки");
                System.out.println(text);
                writeToLog(text, filePathName);

            }

        }
    }


    public static void writeToLog(String message, String filePathName) {
        try (FileWriter writer = new FileWriter(filePathName, true)) {
            // запись всей строки
            writer.write(message);
            writer.append('\n');
            // запись по символам
//            writer.append('\n');
//            writer.append('E');
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

    public static void deleteLog(String filePathName) { // Спасибо Ya GPT за подсказку
        try {
            File file = new File(filePathName);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}