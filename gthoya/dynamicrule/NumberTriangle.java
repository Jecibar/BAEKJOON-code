package dynamicrule;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        int[][] input = new int[inputCount][inputCount];
        int[][] result = new int[inputCount][inputCount];

        for (int i = 0; i < inputCount; i++) {
            for (int j = 0; j <= i; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        result[0][0] = input[0][0];

        for (int i = 1; i < inputCount; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    result[i][j] = input[i][j] + result[i - 1][j];
                } else if (j == i) {
                    result[i][j] = input[i][j] + result[i - 1][j - 1];
                } else {
                    result[i][j] = input[i][j] + max(result[i - 1][j - 1], result[i - 1][j]);
                }
            }
        }

        int output = result[inputCount - 1][0];

        for (int i = 1; i < inputCount; i++) {
            output = max(output, result[inputCount - 1][i]);
        }

        System.out.println(output);
    }

    private static int max(int data1, int data2) {
        return (data1 > data2) ? data1 : data2;
    }
}
