package backjoon.implement;

import java.util.Scanner;

public class LessThanX {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        int x = scanner.nextInt();
        int inputNumber;

        for (int i = 0; i < inputCount; i++) {
            inputNumber = scanner.nextInt();
            if (inputNumber < x) {
                System.out.print(inputNumber + " ");
            }
        }
    }
}
