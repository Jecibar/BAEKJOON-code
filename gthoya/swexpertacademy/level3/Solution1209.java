package swexpertacademy.level3;

import java.util.Scanner;

public class Solution1209 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int[][] data;
        int temp, tempResult, result;

        for (int i = 1; i <= 10; i++) {
            scanner.nextInt();
            data = new int[101][101];
            temp = 0;
            result = 0;

            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < 100; k++) {
                    data[j][k] = scanner.nextInt();
                    data[j][100] += data[j][k];
                    data[100][k] += data[j][k];

                    if (j == k) {
                        data[100][100] += data[j][k];
                    }

                    if (j + k == 99) {
                        temp += data[j][k];
                    }
                }
            }

            for (int j = 0; j < 100; j++) {
                tempResult = (data[j][100] > data[100][j] ? data[j][100] : data[100][j]);
                result = (result > tempResult ? result : tempResult);
            }

            System.out.println("#" + i + " " + (temp > result ? temp : result));
        }
    }
}
