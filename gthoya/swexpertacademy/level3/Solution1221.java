package swexpertacademy.level3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution1221 {
    private static Map<String, Integer> stringToNumeric = new HashMap<String, Integer>();
    private static Map<Integer, String> numericToString = new HashMap<Integer, String>();

    static {
        stringToNumeric.put("ZRO", 0);
        stringToNumeric.put("ONE", 1);
        stringToNumeric.put("TWO", 2);
        stringToNumeric.put("THR", 3);
        stringToNumeric.put("FOR", 4);
        stringToNumeric.put("FIV", 5);
        stringToNumeric.put("SIX", 6);
        stringToNumeric.put("SVN", 7);
        stringToNumeric.put("EGT", 8);
        stringToNumeric.put("NIN", 9);

        numericToString.put(0, "ZRO");
        numericToString.put(1, "ONE");
        numericToString.put(2, "TWO");
        numericToString.put(3, "THR");
        numericToString.put(4, "FOR");
        numericToString.put(5, "FIV");
        numericToString.put(6, "SIX");
        numericToString.put(7, "SVN");
        numericToString.put(8, "EGT");
        numericToString.put(9, "NIN");
    }

    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int[] numericCount;
        int orderCount = scanner.nextInt();
        String order;
        int inputLength;

        for (int i = 0; i < orderCount; i++) {
            numericCount = new int[10];
            order = scanner.next();
            inputLength = scanner.nextInt();

            for (int j = 0; j < inputLength; j++) {
                numericCount[stringToNumeric.get(scanner.next())]++;
            }


            System.out.println(order);
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < numericCount[j]; k++) {
                    System.out.print(numericToString.get(j) + " ");
                }
            }
            System.out.println();
        }
    }
}
