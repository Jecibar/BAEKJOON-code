package divide;

import java.util.Scanner;

public class MultipleMatrix {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);

        int matrix1Height = scanner.nextInt();
        int matrix1Birth = scanner.nextInt();
        int[][] matrix1 = new int[matrix1Height][matrix1Birth];

        for (int i = 0; i < matrix1Height; i++) {
            for (int j = 0; j < matrix1Birth; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        int matrix2Height = scanner.nextInt();
        int matrix2Birth = scanner.nextInt();
        int[][] matrix2 = new int[matrix2Height][matrix2Birth];
        for (int i = 0; i < matrix2Height; i++) {
            for (int j = 0; j < matrix2Birth; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] resultMatrix = new int[matrix1Height][matrix2Birth];
        for (int i = 0; i < matrix1Height; i++) {
            for (int j = 0; j < matrix2Birth; j++) {
                for (int k = 0; k < matrix1Birth; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        for (int i = 0; i < matrix1Height; i++) {
            for (int j = 0; j < matrix2Birth; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
