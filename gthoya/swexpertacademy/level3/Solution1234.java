package swexpertacademy.level3;

import java.util.Scanner;

public class Solution1234 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int inputLength;
        String inputString;
        char[] inputCharArray;

        for (int i = 1; i <= 10; i++) {
            inputLength = scanner.nextInt();
            inputString = scanner.next();
            inputCharArray = inputString.toCharArray();

            for (int j = 1; j < inputLength; j++) {
                if (inputCharArray[j - 1] == inputCharArray[j]) {
                    for (int k = j; k < inputLength - 1; k++) {
                        inputCharArray[k - 1] = inputCharArray[k + 1];
                    }

                    inputLength = inputLength - 2;
                    inputCharArray = String.valueOf(inputCharArray).substring(0, inputLength).toCharArray();
                    j -= (j == 1 ? 1 : 2);
                }
            }

            System.out.println("#" + i + " " + String.valueOf(inputCharArray));
        }
    }
}
