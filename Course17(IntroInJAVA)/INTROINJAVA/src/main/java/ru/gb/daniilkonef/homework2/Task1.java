package ru.gb.daniilkonef.homework2;

import org.json.simple.JSONObject; // https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple/1.1.1
import org.json.simple.parser.JSONParser; // https://code.google.com/archive/p/json-simple/
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Task1 {

    public static void run() {
        // если покажется что тут все слишком сложно написано и не по теме урока, то это потому что мне было проще разобраться как подключить стороннюю библиотеку (впервые кстати так делаю) и сделать более разумно нежели городить колхозные алгоритмы по собственному анализу json строк.
        try {
            Object parser = new JSONParser().parse(new FileReader("src/main/java/ru/gb/daniilkonef/homework2/file.json"));
            JSONObject jsonFile = (JSONObject) parser;

            String ContactName = (String) jsonFile.get("ContactName");
            String Country = (String) jsonFile.get("Country");
            String City = (String) jsonFile.get("City");
            String Age = (String) jsonFile.get("Age");

            StringBuilder WHERE = new StringBuilder();

            if (!ContactName.equals("null")) {
                WHERE
                        .append("ContactName = ")
                        .append("\'")
                        .append(ContactName)
                        .append("\'");
            }

            if (!Country.equals("null")) {
                WHERE
                        .append(" and ")        // ох мозги мои перегрелись пока я догадался добавлять and в начало а не в конец блока append
                        .append("Country = ")
                        .append("\'")
                        .append(Country)
                        .append("\'");
            }

            if (!City.equals("null")) {
                WHERE
                        .append(" and ")
                        .append("City = ")
                        .append("\'")
                        .append(City)
                        .append("\'");
            }

            if (!Age.equals("null")) {
                WHERE
                        .append(" and ")
                        .append("Age = ")
                        .append("\'")
                        .append(Age)
                        .append("\'");
            }

            System.out.println();
            System.out.print("Вставьте следующий SQL запрос: ");
            System.out.println("select * from Customers WHERE " + WHERE.toString());
            System.out.println("сюда: https://www.w3schools.com/sql/trysql.asp?filename=trysql_op_in");
            System.out.println("и нажмите кнопку Run SQL");

        } catch (IOException e) {
            System.out.println("Сработало исключение IOException");
            System.out.println(e.getMessage());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        // Домашка сделана с помощью:
        // 1) https://javarush.com/groups/posts/3970-kofe-breyk-175-kak-mih-mozhem-prochitatjh-fayl-json-v-java-chto-takoe-java-development-kit-jdk
        // 2) Yandex GPT (особенная благодарность)
        // 3) небольшого кол-ва моих закипевших мозгов еще

    }
}
