package Oophwrk;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        FamilyPerson vasya = new FamilyPerson("Вася", "Пупкин", "Пупкин",new GregorianCalendar(2000,11,5),"male");
        FamilyPerson masha = new FamilyPerson("Маша", "Пупкина", "Васильева",new GregorianCalendar(2001,5,1),"female");
        FamilyPerson sergay = new FamilyPerson("Сергей", "Пупкин", "Пупкин",new GregorianCalendar(1950,1,20),"male");
        FamilyPerson lena = new FamilyPerson("Лена", "Пупкина", "Пупкина",new GregorianCalendar(2018,10,15),"female");
        FamilyPerson olya = new FamilyPerson("Оля", "Пупкина", "Пупкина",new GregorianCalendar(2020,2,25),"female");
        FamilyNode family2= new FamilyNode(sergay,sergay);
        family2.setFamilyName("Пупкины 1");
        FamilyNode family1 = new FamilyNode(vasya,masha);
        family1.setFamilyName("Пупкины 2");
        family1.setChild(lena);
        family1.setChild(olya);
        family1.addHusbandParents(family2);
        Research research = new Research();

        System.out.print(IO.RED +"First family: "+IO.RESET);
        family1.printFamilyNode();
        System.out.print(IO.RED +"\n\nSecond family:"+IO.RESET);
        family2.printFamilyNode();
        System.out.printf("%s\n\nParents of: %s %s%s",IO.RED,lena.getName(),lena.getSurname(),IO.RESET);
        research.getPersonParents(lena).printCouple();
        System.out.printf("%s\n\nRelations of: %s %s%s",IO.RED,lena.getName(),lena.getSurname(),IO.RESET);
        research.printRelations(lena);

    }
}
