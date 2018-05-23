package swexpertacademy.level3;

import java.util.Scanner;

public class Solution1215 {
    private static final int MAX_LENGTH = 8;

    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        char[][] input = new char[MAX_LENGTH][MAX_LENGTH];
        String inputLine;
        int palindromeLength, result;

        for (int i = 1; i <= 10; i++) {
            palindromeLength = scanner.nextInt();
            for (int j = 0; j < MAX_LENGTH; j++) {
                inputLine = scanner.next();
                for (int k = 0; k < MAX_LENGTH; k++) {
                    input[j][k] = inputLine.charAt(k);
                }
            }

            result = 0;
            for (int j = 0; j < MAX_LENGTH; j++) {
                for (int k = 0; k <= MAX_LENGTH - palindromeLength; k++) {
                    for (int l = 0; l < palindromeLength / 2; l++) {
                        if (input[j][k + l] != input[j][k - l + palindromeLength - 1]) {
                            break;
                        }

                        if (l + 1 == palindromeLength / 2) {
                            result++;
                        }
                    }
                }
            }

            for (int j = 0; j < MAX_LENGTH; j++) {
                for (int k = 0; k <= MAX_LENGTH - palindromeLength; k++) {
                    for (int l = 0; l < palindromeLength / 2; l++) {
                        if (input[k + l][j] != input[k - l + palindromeLength - 1][j]) {
                            break;
                        }

                        if (l + 1 == palindromeLength / 2) {
                            result++;
                        }
                    }
                }
            }

            System.out.println("#" + i + " " + result);
        }
    }
}
