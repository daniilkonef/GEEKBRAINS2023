package Application.Controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MrFileManager {

    // Метод для создания текстового файла и записи в него текста
    public static void doCreateFileTxt(String fileName, String textToWrite) {
        try {
            // Создаем объект FileWriter для записи в файл
            FileWriter fileWriter = new FileWriter(fileName+".txt");

            // Создаем объект BufferedWriter для более эффективной записи
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Записываем текст в файл
            bufferedWriter.write(textToWrite);

            // Закрываем потоки
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Текстовый файл '" + fileName + "' успешно создан.");
        } catch (IOException e) {
            System.err.println("Произошла ошибка при создании файла: " + e.getMessage());
        }
    }
}
