package rule;

import java.util.Scanner;

public class CainCalendar {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int orderCount = scanner.nextInt();

        int m, n, x, y;
        int calcY;
        int lcm;

        for (int i = 0; i < orderCount; i++) {
            m = scanner.nextInt();
            n = scanner.nextInt();
            x = scanner.nextInt();
            y = scanner.nextInt();
            lcm = (m * n) / gcd(m, n);

            for (int j = 0; j <= lcm; j += m) {
                calcY = (j + x) % n;
                if (calcY == 0) {
                    calcY = n;
                }

                if (calcY == y) {
                    System.out.println(j + x);
                    break;
                }

                if (j == lcm) {
                    System.out.println(-1);
                }
            }
        }
    }

    public static int gcd(int a, int b) {
        int tmp;

        while(b != 0) {
            tmp = a;
            a = b;
            b = tmp % b;
        }

        return a;
    }
}