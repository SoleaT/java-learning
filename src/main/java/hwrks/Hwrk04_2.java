package hwrks;

import java.util.LinkedList;
import java.util.List;

public class Hwrk04_2 {
    public static void main(String[] args) {
        LinkedList<String> workArray = new LinkedList<>(List.of("a1", "b2", "c3", "d4", "e5", "f6", "g7"));
        System.out.println(workArray);
        String temp;
        for (int i = 0; i < workArray.size()-1; i++) {
            temp = workArray.getLast();
            workArray.add(i, temp);
            workArray.removeLast();
        }
        System.out.println(workArray);
    }
}
