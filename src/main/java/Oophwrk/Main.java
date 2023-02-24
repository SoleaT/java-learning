package Oophwrk;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Man vasya = new Man("Вася", "Пупкин", "Пупкин",new GregorianCalendar(2000,11,5),"male");
        Man masha = new Man("Маша", "Пупкина", "Васильева",new GregorianCalendar(2001,5,1),"female");
        Man sergay = new Man("Сергей", "Пупкин", "Пупкин",new GregorianCalendar(1950,1,20),"male");
        Man lena = new Man("Лена", "Пупкина", "Пупкина",new GregorianCalendar(2018,10,15),"female");
        Man olya = new Man("Оля", "Пупкина", "Пупкина",new GregorianCalendar(2020,2,25),"female");
        System.out.println(vasya);
        System.out.println(masha);
        System.out.println(lena);
        System.out.println(olya);
    }
}
