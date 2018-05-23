package backjoon.divide;

import java.util.Scanner;

public class CountOfPaper {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int[] paperNumber = new int[3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        calculatePaperCount(matrix, paperNumber, 0, 0, n);

        for (int i = 0; i < 3; i++) {
            System.out.println(paperNumber[i]);
        }
    }

    private static void calculatePaperCount(int[][] matrix, int[] paperNumber, int x, int y, int n) {
        boolean[] hasNumber = new boolean[3];

        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                hasNumber[matrix[i][j] + 1] = true;
            }
        }

        if (hasNumber[0] && !hasNumber[1] && !hasNumber[2]) {
            paperNumber[0]++;
        } else if (!hasNumber[0] && hasNumber[1] && !hasNumber[2]) {
            paperNumber[1]++;
        } else if (!hasNumber[0] && !hasNumber[1] && hasNumber[2]) {
            paperNumber[2]++;
        } else {
            int next = n / 3;
            calculatePaperCount(matrix, paperNumber, x, y, next);
            calculatePaperCount(matrix, paperNumber, x, y + next, next);
            calculatePaperCount(matrix, paperNumber, x, y + next * 2, next);

            calculatePaperCount(matrix, paperNumber, x + next, y, next);
            calculatePaperCount(matrix, paperNumber, x + next, y + next, next);
            calculatePaperCount(matrix, paperNumber, x + next, y + next * 2, next);

            calculatePaperCount(matrix, paperNumber, x + next * 2, y, next);
            calculatePaperCount(matrix, paperNumber, x + next * 2, y + next, next);
            calculatePaperCount(matrix, paperNumber, x + next * 2, y + next * 2, next);
        }
    }
}
