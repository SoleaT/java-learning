package Oophwrk;

import java.util.Calendar;

public class Man extends Person {

    private String gender;

    public Man(String name, String surname, String maidenName, Calendar dateOfBirth, String gender) {
        super(name, surname, maidenName, dateOfBirth);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        String sex = getGender().equals("male") ? "мужчина" : "женщина";

        return getName() + " " + getSurname() + ", " + sex + ", "
                + getDateOfBirth().get(Calendar.DAY_OF_MONTH) + "."
                + getDateOfBirth().get(Calendar.MONTH) + "."
                + getDateOfBirth().get(Calendar.YEAR);
    }
}
