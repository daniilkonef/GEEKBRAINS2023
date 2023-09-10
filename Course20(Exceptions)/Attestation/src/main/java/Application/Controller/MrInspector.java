package Application.Controller;

import Application.Exceptions.IllegalAmountOfPersonsFeatures;
import Application.Exceptions.IllegalTypeOfPersonsGender;

import java.util.ArrayList;
import java.util.Arrays;

import static Application.Presenter.Console.printLine;

public class MrInspector {

    public static void doCheckTheAmountOfInputDataIn(String text) {
        ArrayList<String> personsFeaturesList = new ArrayList<>(Arrays.asList(text.split(" ")));
        if(personsFeaturesList.size() > 5) {
            printLine("Вы ввели больше данных чем требуется. Попробуйте снова.");
            throw new IllegalAmountOfPersonsFeatures();
        }
        if(personsFeaturesList.size() < 5) {
            printLine("Вы ввели меньше данных чем требуется. Попробуйте снова.");
            throw new IllegalAmountOfPersonsFeatures();
        }
    }


    public static void doCheckTheGenderTypeIn(String text ) {
        ArrayList<String> personsFeaturesList = new ArrayList<>(Arrays.asList(text.split(" ")));
        Integer indexOfLastItem = personsFeaturesList.size()-1;
        if (personsFeaturesList.get(indexOfLastItem).equals("f") || personsFeaturesList.get(indexOfLastItem).equals("m")) {
            // все нормально
        }
        else throw new IllegalTypeOfPersonsGender();


    }
}
