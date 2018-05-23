package swexpertacademy.level3;

import java.util.Scanner;

public class Solution1217 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            scanner.nextInt();
            System.out.println("#" + i + " " + multiply(scanner.nextInt(), scanner.nextInt()));
        }
    }

    private static int multiply(int n, int m) {
        if (m == 1) {
            return n;
        }

        return n * multiply(n, m - 1);
    }
}
