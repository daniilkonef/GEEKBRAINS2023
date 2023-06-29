package ru.gb.daniilkonef.homework2;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;

public class Task1 {

    public static void run() {
//        File logFile = new File("log.txt");
//        try (FileWriter fileWriter = new FileWriter(logFile, true)) {
//
//
//        } catch (IOException ex) {
//
//        }


//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("file.json"));
//            String line;
//
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//
//            reader.close();
//            System.out.println("Успешно прочитался файл.");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        try {
//            System.out.println("hello");
            Object o = new JSONParser().parse(new FileReader("file.json"));
            JSONObject j = (JSONObject) o;
            String Name = (String) j.get("Name");
            String College = (String) j.get("College");
            System.out.println("Name :" + Name);
            System.out.println("College :" + College);
        } catch (IOException e) {
            System.out.println("Сработало исключение IOException");
            System.out.println(e.getMessage());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        // код написан с помощью:
        // 1) https://javarush.com/groups/posts/3970-kofe-breyk-175-kak-mih-mozhem-prochitatjh-fayl-json-v-java-chto-takoe-java-development-kit-jdk
        // 2) Yandex GPT

    }
}
