package backjoon.math;

import java.util.Scanner;

public class NotSquareCounter {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        long min = scanner.nextInt();
        long max = scanner.nextInt();
        long squareCount = 0;

        long maxSquareRoot = (long) Math.sqrt(Math.sqrt(Math.sqrt(Double.parseDouble(String.valueOf(max)))));
        long squareNumber = maxSquareRoot;

        System.out.println(max - min - squareCount + 1);
    }
}
