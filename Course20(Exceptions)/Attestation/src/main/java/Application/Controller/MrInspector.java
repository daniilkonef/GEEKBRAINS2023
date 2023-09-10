package Application.Controller;

import Application.Exceptions.IllegalAmountOfPersonsFeatures;
import Application.Exceptions.IllegalTypeOfPersonsGender;

import java.util.ArrayList;

import static Application.Presenter.Console.printLine;

public class MrInspector {

    public static void doCheckTheAmountOfInputDataIn(ArrayList<String> personFeatures ) {
        if(personFeatures.size() > 5) {
            printLine("Вы ввели больше данных чем требуется. Попробуйте снова.");
            throw new IllegalAmountOfPersonsFeatures();
        }
        if(personFeatures.size() < 5) {
            printLine("Вы ввели меньше данных чем требуется. Попробуйте снова.");
            throw new IllegalAmountOfPersonsFeatures();
        }
    }


    public static void doCheckTheGenderTypeIn(ArrayList<String> list ) {
        Integer lastItem = list.size()-1;
        if (list.get(lastItem).equals("f") || list.get(lastItem).equals("m")) {

        }
        else throw new IllegalTypeOfPersonsGender();


    }
}
