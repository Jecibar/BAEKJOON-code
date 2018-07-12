package swexpertacademy.level3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution1243 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int orderCount = scanner.nextInt();
        String input;
        Character[] inputCharArray;
        int changeCount, inputLength;

        for (int i = 1; i <= orderCount; i++) {
            input = scanner.next();
            changeCount = scanner.nextInt();

            inputLength = input.length();
            inputCharArray = new Character[inputLength];
            for (int j = 0; j < inputLength; j++) {
                inputCharArray[j] = input.charAt(j);
            }

            System.out.println("#" + i + " " + calculateMaxBenefit(inputCharArray, inputLength, changeCount));
        }
    }

    private static String calculateMaxBenefit(Character[] inputCharArray, int inputLength, int changeCount) {
        Character[] sortedCharArray = new Character[inputLength];
        boolean isSameNumber = false;

        for (int i = 0; i < inputLength; i++) {
            sortedCharArray[i] = inputCharArray[i];
        }

        Arrays.sort(sortedCharArray, Comparator.reverseOrder());

        for (int i = 0; i < changeCount; i++) {
            for (int j = 0; j < inputLength; j++) {
                if (inputCharArray[j] == sortedCharArray[j]) {
                    if (j == inputLength - 1) {
                        for (int k = 1; k < inputLength; k++) {
                            if (inputCharArray[k - 1] == inputCharArray[k]) {
                                isSameNumber = true;
                                break;
                            }
                        }

                        if (isSameNumber) {
                            continue;
                        }

                        swap(inputCharArray, j, j - 1);
                    }

                    continue;
                }

                int max = 0, maxIndex = 0;
                for (int k = j; k < inputLength; k++) {
                    if (inputCharArray[k] >= max) {
                        max = inputCharArray[k];
                        maxIndex = k;
                    }
                }

                swap(inputCharArray, maxIndex, j);
                break;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputLength; i++) {
            result.append(inputCharArray[i]);
        }

        return result.toString();
    }

    private static void swap(Character[] inputCharArray, int index1, int index2) {
        char temp = inputCharArray[index1];
        inputCharArray[index1] = inputCharArray[index2];
        inputCharArray[index2] = temp;
    }
}
