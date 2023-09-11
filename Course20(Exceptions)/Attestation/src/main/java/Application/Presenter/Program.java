package Application.Presenter;

import Application.Controller.MrFileManager;
import Application.Controller.MrInspector;
import Application.DataModel.Person;
import Application.Exceptions.IllegalAmountOfPersonsFeatures;
import Application.Exceptions.IllegalTypeOfPersonsGender;

import java.io.File;
import java.util.Objects;
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

            Person currentPerson = new Person(properties);
            if((new File(currentPerson.getSecondName()+".txt").exists())) {
                MrFileManager.doAppendToFileTxt(currentPerson.getSecondName(), currentPerson.toString());
            }
            else {
                MrFileManager.doCreateFileTxt(currentPerson.getSecondName(), currentPerson.toString());
            }
            Console.printLine("");
            currentPerson = null;



        }
    }
}