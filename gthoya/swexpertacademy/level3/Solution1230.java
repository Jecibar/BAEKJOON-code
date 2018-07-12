package swexpertacademy.level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1230 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int passwordLength;
        List<Integer> password;

        for (int i = 1; i <= 10; i++) {
            passwordLength = scanner.nextInt();
            password = new ArrayList<Integer>();

            for (int j = 0; j < passwordLength; j++) {
                password.add(scanner.nextInt());
            }

            changePassword(scanner, password);

            passwordLength = (password.size() < 10 ? password.size() : 10);
            System.out.print("#" + i);
            for (int j = 0; j < passwordLength; j++) {
                System.out.print(" " + password.get(j));
            }
            System.out.println();
        }
    }

    private static void changePassword(Scanner scanner, List<Integer> password) {
        String order;
        int position, count;
        int orderCount = scanner.nextInt();

        for (int j = 0; j < orderCount; j++) {
            order = scanner.next();

            switch (order) {
                case "I" :
                    position = scanner.nextInt();
                    count = scanner.nextInt();
                    for (int k = 0; k < count; k++) {
                        password.add(position++, scanner.nextInt());
                    }

                    break;

                case "D" :
                    position = scanner.nextInt();
                    count = scanner.nextInt();
                    for (int k = 0; k < count; k++) {
                        password.remove(position);
                    }

                    break;

                case "A" :
                    count = scanner.nextInt();
                    for (int k = 0; k < count; k++) {
                        password.add(password.size(), scanner.nextInt());
                    }

                    break;
            }
        }
    }
}
