package swexpertacademy.level3;

import java.util.Scanner;

public class Solution1225 {
    private static final int SIZE = 8;

    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int[] inputNumber = new int[SIZE];
        int currentNumber, currentMinusNumber;

        for (int i = 1; i <= 10; i++) {
            scanner.nextInt();
            currentNumber = 0;
            currentMinusNumber = 1;
            for (int j = 0; j < SIZE; j++) {
                inputNumber[j] = scanner.nextInt();
            }

            while (true) {
                inputNumber[currentNumber] = inputNumber[currentNumber] - currentMinusNumber;

                if (inputNumber[currentNumber] <= 0) {
                    inputNumber[currentNumber] = 0;
                    break;
                }

                if (currentNumber == SIZE - 1) {
                    currentNumber = 0;
                } else {
                    currentNumber++;
                }

                if (currentMinusNumber == 5) {
                    currentMinusNumber = 1;
                } else {
                    currentMinusNumber++;
                }
            }

            System.out.print("#" + i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(" " + inputNumber[(currentNumber + j + 1) % SIZE]);
            }
            System.out.println();
        }
    }
}
