package swexpertacademy.level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1228 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int passwordLength, orderCount, insertPosition, insertCount;
        List<Integer> password;

        for (int i = 1; i <= 10; i++) {
            passwordLength = scanner.nextInt();
            password = new ArrayList<Integer>();

            for (int j = 0; j < passwordLength; j++) {
                password.add(scanner.nextInt());
            }

            orderCount = scanner.nextInt();
            for (int j = 0; j < orderCount; j++) {
                scanner.next();
                insertPosition = scanner.nextInt();
                insertCount = scanner.nextInt();

                for (int k = 0; k < insertCount; k++) {
                    password.add(insertPosition++, scanner.nextInt());
                }
            }

            passwordLength = (password.size() < 10 ? password.size() : 10);
            System.out.print("#" + i);
            for (int j = 0; j < passwordLength; j++) {
                System.out.print(" " + password.get(j));
            }
            System.out.println();
        }
    }
}
