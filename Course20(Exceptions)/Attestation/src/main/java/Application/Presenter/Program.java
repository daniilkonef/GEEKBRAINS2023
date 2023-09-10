package Application.Presenter;

import Application.Controller.MrFileManager;
import Application.Controller.MrInspector;
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
            String txtLine = input.nextLine();
            ArrayList<String> personsFeaturesList = new ArrayList<>(Arrays.asList(txtLine.split(" ")));

            try {
                MrInspector.doCheckTheAmountOfInputDataIn( personsFeaturesList );
            }
            catch (IllegalAmountOfPersonsFeatures e) {}

            try {
                MrInspector.doCheckTheGenderTypeIn(personsFeaturesList);
            }
            catch (IllegalTypeOfPersonsGender e) {}

            Integer indexOfFirstName = 0; // имя
            Integer indexOfSecondName = 1; // фамилия
            Integer indexOfLastName = 2; // отчество
            Integer indexOfBirthDate = 3;
            Integer indexOfGenderType = 4;

            String firstName = personsFeaturesList.get(indexOfFirstName);
            String secondName = personsFeaturesList.get(indexOfSecondName);


            MrFileManager.doCreateFileTxt(secondName,personsFeaturesList.toString());
            Console.printLine("");



        }
    }
}