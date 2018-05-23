package swexpertacademy.level3;

import java.util.Scanner;

public class Solution1213 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        String compareString, inputString;
        int count, compareStringLength, checkLength;

        for (int i = 1; i <= 10; i++) {
            scanner.nextInt();
            compareString = scanner.next();
            inputString = scanner.next();
            count = 0;
            compareStringLength = compareString.length();
            checkLength = inputString.length() - compareStringLength + 1;

            for (int j = 0; j < checkLength; j++) {
                for (int k = 0; k < compareStringLength; k++) {
                    if (inputString.charAt(j + k) != compareString.charAt(k)) {
                        break;
                    } else if (k == compareStringLength - 1) {
                        count++;
                    }
                }
            }

            System.out.println("#" + i + " " + count);
        }
    }
}
