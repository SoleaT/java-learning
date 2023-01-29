package hwrks;

import java.util.Random;
import java.util.Scanner;

public class Stuff_hwrk {
    public static int[] formArray(int arrSize,int minBorder,int maxBorder) {
        Random rnd = new Random();
        int[] tempArr = new int[arrSize + 1];
        for (int i = 0; i <= arrSize; i++) {
            tempArr[i] = rnd.nextInt(minBorder, maxBorder + 1);
        }
        return tempArr;
    }

    public static int readDigit() {
        int temp;
        Scanner readL = new Scanner(System.in);
        temp = readL.nextInt();
        return temp;
    }

    public static String readStr() {
        Scanner readL = new Scanner(System.in);
        return readL.next();
    }
}


