package Application.Presenter;

import Application.Controller.MrFileManager;
import Application.Controller.MrInspector;
import Application.DataModel.Person;
import Application.Exceptions.IllegalAmountOfPersonsFeatures;
import Application.Exceptions.IllegalTypeOfPersonsGender;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        while (true) {
            Scanner inputUserData = new Scanner(System.in);
            System.out.print("Введите ваши данные: ");
            String properties = inputUserData.nextLine();

            try {
                MrInspector.doCheckTheAmountOfInputDataIn(properties);
            } catch (IllegalAmountOfPersonsFeatures e) {
                //
            }

            try {
                MrInspector.doCheckTheGenderTypeIn(properties);
            } catch (IllegalTypeOfPersonsGender e) {
                //
            }

            Person person = new Person(properties);
            if((new File("Денис.txt").exists())) {
                MrFileManager.doAppendToFileTxt(person.getSecondName(), person.toString());
            }
            else {
                MrFileManager.doCreateFileTxt(person.getSecondName(), person.toString());
            }
            Console.printLine("");

            person = null;


        }
    }
}