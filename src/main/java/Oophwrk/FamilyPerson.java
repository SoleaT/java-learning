package Oophwrk;

import java.util.Calendar;

public class FamilyPerson extends Person implements IO{

    private String gender;
    private FamilyNode parents;

    public FamilyNode getFamily() {
        return family;
    }

    public void setFamily(FamilyNode family) {
        this.family = family;
    }

    private FamilyNode family;

    public FamilyPerson(String name, String surname, String maidenName, Calendar dateOfBirth, String gender) {
        super(name, surname, maidenName, dateOfBirth);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public void printInfo() {
        String sex = getGender().equals("male") ? "мужчина" : "женщина";

        System.out.print(getName() + " " + getSurname() + ", " + sex + ", "
                + getDateOfBirth().get(Calendar.DAY_OF_MONTH) + "."
                + getDateOfBirth().get(Calendar.MONTH) + "."
                + getDateOfBirth().get(Calendar.YEAR));
    }

    public FamilyNode getParents() {
        return parents;
    }

    public void setParents(FamilyNode parents) {
        this.parents = parents;
    }
}
