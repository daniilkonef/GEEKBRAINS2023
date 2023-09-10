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
            Scanner input = new Scanner(System.in);
            System.out.print("Введите ваши данные: ");
            String text = input.nextLine();
            //ArrayList<String> personsFeaturesList = new ArrayList<>(Arrays.asList(text.split(" ")));

            try {
                MrInspector.doCheckTheAmountOfInputDataIn( text );
            }
            catch (IllegalAmountOfPersonsFeatures e) {}

            try {
                MrInspector.doCheckTheGenderTypeIn(text);
            }
            catch (IllegalTypeOfPersonsGender e) {}

            Person person = new Person(text);

            Integer indexOfFirstName = 0; // имя
            Integer indexOfSecondName = 1; // фамилия
            Integer indexOfLastName = 2; // отчество
            Integer indexOfBirthDate = 3;
            Integer indexOfGenderType = 4;

            String firstName = person.getFirstName();
            String secondName = person.getSecondName();


            MrFileManager.doCreateFileTxt(secondName,person.toString());
            Console.printLine("");



        }
    }
}