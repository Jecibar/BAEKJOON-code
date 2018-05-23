package backjoon.implement;

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();

        System.out.printf("%6f", r * r * Math.PI);
        System.out.println();
        System.out.printf("%6f", r * r * 2.0);
    }
}
