package Application.Presenter;

import Application.Controller.MrFileManager;
import Application.Controller.MrInspector;
import Application.DataModel.Person;
import Application.Exceptions.IllegalAmountOfPersonsFeatures;
import Application.Exceptions.IllegalTypeOfPersonsGender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        while (true)
        {
            Scanner inputUserData = new Scanner(System.in);
            System.out.print("Введите ваши данные: ");
            String properties = inputUserData.nextLine();

            try {
                MrInspector.doCheckTheAmountOfInputDataIn( properties );
            }
            catch (IllegalAmountOfPersonsFeatures e) {}

            try {
                MrInspector.doCheckTheGenderTypeIn(properties);
            }
            catch (IllegalTypeOfPersonsGender e) {}

            Person person = new Person(properties);
            MrFileManager.doCreateFileTxt(person.getSecondName(),person.toString());
            person = null;

            Console.printLine("");




        }
    }
}