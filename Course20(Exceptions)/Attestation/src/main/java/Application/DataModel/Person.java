package Application.DataModel;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {

    /*state*/ private String firstName = null; // имя
    /*state*/ private String secondName = null; // фамилия
    /*state*/ private String lastName = null; // отчество
    /*state*/ private String birthDate = null; // день рожд
    /*state*/ private String genderType = null; // пол

    /*state*/ private Integer indexOfFirstName = 0; // имя
    /*state*/ private Integer indexOfSecondName = 1; // фамилия
    /*state*/ private Integer indexOfLastName = 2; // отчество
    /*state*/ private Integer indexOfBirthDate = 3; // день рожд
    /*state*/ private Integer indexOfGenderType = 4; // пол

    /*constructor*/ public Person(String text) {
        ArrayList<String> personsFeaturesList = new ArrayList<>(Arrays.asList(text.split(" ")));

        this.firstName = personsFeaturesList.get(indexOfFirstName);
        this.secondName = personsFeaturesList.get(indexOfSecondName);
        this.lastName = personsFeaturesList.get(indexOfLastName);
        this.birthDate = personsFeaturesList.get(indexOfBirthDate);
        this.genderType = personsFeaturesList.get(indexOfGenderType);
    }


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getGenderType() {
        return genderType;
    }

    @Override
    public String toString() {
        String space = " ";
        return firstName +space+ secondName +space+ lastName +space+ birthDate +space+ genderType;
    }
}
