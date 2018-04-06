package dynamicrule;

import java.util.Scanner;

public class RGB {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int orderCount = scanner.nextInt();
        int[][] input = new int[orderCount][3];
        int[][] result = new int[orderCount][3];

        for (int i = 0; i < orderCount; i++) {
            input[i][0] = scanner.nextInt();
            input[i][1] = scanner.nextInt();
            input[i][2] = scanner.nextInt();
        }

        result[0][0] = input[0][0];
        result[0][1] = input[0][1];
        result[0][2] = input[0][2];

        for (int i = 1; i < orderCount; i++) {
            result[i][0] = input[i][0] + Integer.min(result[i - 1][1], result[i - 1][2]);
            result[i][1] = input[i][1] + Integer.min(result[i - 1][0], result[i - 1][2]);
            result[i][2] = input[i][2] + Integer.min(result[i - 1][0], result[i - 1][1]);
        }

        System.out.println(min(result[orderCount - 1][0], result[orderCount - 1][1], result[orderCount - 1][2]));
    }

    private static int min(int data1, int data2, int data3) {
        int temp = (data1 < data2) ? data1 : data2;
        return (temp < data3) ? temp : data3;
    }
}