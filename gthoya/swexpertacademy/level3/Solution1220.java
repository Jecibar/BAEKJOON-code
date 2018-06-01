package swexpertacademy.level3;

import java.util.Scanner;

public class Solution1220 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int size, deadlockCount;
        int[][] square;
        boolean possibleDeadlock;

        for (int i = 1; i <= 10; i++) {
            size = scanner.nextInt();
            square = new int[size][size];
            deadlockCount = 0;

            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    square[j][k] = scanner.nextInt();
                }
            }

            for (int j = 0; j < size; j++) {
                possibleDeadlock = false;

                for (int k = 0; k < size; k++) {
                    if (square[k][j] == 1) {
                        possibleDeadlock = true;
                    } else if (square[k][j] == 2 && possibleDeadlock == true) {
                        possibleDeadlock = false;
                        deadlockCount++;
                    }
                }
            }

            System.out.println("#" + i + " " + deadlockCount);
        }
    }
}
