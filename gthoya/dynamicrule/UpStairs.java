package dynamicrule;

import java.util.Scanner;

public class UpStairs {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int stairsCount = scanner.nextInt();
        int[] stairs = new int[stairsCount];
        int[] result = new int[stairsCount];

        for (int i = 0; i < stairsCount; i++) {
            stairs[i] = scanner.nextInt();
        }

        if (stairsCount == 0) {
            System.out.println(0);
        } else if (stairsCount == 1) {
            System.out.println(stairs[0]);
        } else if (stairsCount == 2) {
            System.out.println(stairs[0] + stairs[1]);
        } else {
            result[0] = stairs[0];
            result[1] = stairs[0] + stairs[1];
            result[2] = Integer.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);

            for (int i = 3; i < stairsCount; i++) {
                result[i] = Integer.max(stairs[i] + result[i - 2], stairs[i] + stairs[i - 1] + result[i - 3]);
            }

            System.out.println(result[stairsCount - 1]);
        }
    }
}
