package dynamicrule;

import java.util.Scanner;

public class OneMaker {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] result = new int[inputNumber + 1];

        for (int i = 2; i <= inputNumber; i++) {
            result[i] = result[i - 1] + 1;
            if (i % 2 == 0) {
                result[i] = Integer.min(result[i], result[i / 2] + 1);
            }

            if (i % 3 == 0) {
                result[i] = Integer.min(result[i], result[i / 3] + 1);
            }
        }

        System.out.println(result[inputNumber]);
    }
}
