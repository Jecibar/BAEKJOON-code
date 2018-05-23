package backjoon.implement;

import java.util.Scanner;

public class NumberCount {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt() * scanner.nextInt() * scanner.nextInt();
        String result = input.toString();
        int length = result.length();
        int[] countArray = new int[10];

        for (int i = 0; i < length; i++) {
            countArray[result.charAt(i) - 48]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(countArray[i]);
        }
    }
}
