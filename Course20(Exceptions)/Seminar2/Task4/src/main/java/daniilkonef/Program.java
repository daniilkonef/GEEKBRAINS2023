package daniilkonef;

import java.util.Scanner;
//import static Printer.*;
import static daniilkonef.Printer.printLine;




public class Program {
    public static void main(String[] args) {

        while (true)
        {

            Scanner input = new Scanner(System.in);
            System.out.print("Введите ваше дробное число: ");
            String line = input.nextLine(); //System.out.println(query);

            if (line.isEmpty()) System.out.println("Введена пустая строка");

            if (line.equalsIgnoreCase(new String("exit"))) break;
            try {
                float number = Float.parseFloat(line);
            }
            catch (NumberFormatException ex){
                printLine("вы ввели ошибочное число, просьба попробовать снова.");
                continue;

            }


        }

    }
}