package implement;

import java.util.Scanner;

public class Tornado {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();

        int maxLength = getMaxLength(r1, c1, r2, c2);
        String format = "%" + (maxLength) + "d ";

        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                System.out.printf(format, calculateNumber(i, j));
            }

            System.out.println();
        }
    }

    private static int getMaxLength(int r1, int c1, int r2, int c2) {
        int temp1 = calculateNumber(r1, c1);
        int temp2 = calculateNumber(r2, c1);
        int temp3 = calculateNumber(r1, c2);
        int temp4 = calculateNumber(r2, c2);
        Integer max;

        if (temp1 > temp2) {
            max = temp1;
        } else {
            max = temp2;
        }

        if (max < temp3) {
            max = temp3;
        }

        if (max < temp4) {
            max = temp4;
        }

        return max.toString().length();
    }

    private static int calculateNumber(int r, int c) {
        if (r == c) {
            if (r > 0) {
                return (r + c + 1) * (r + c + 1);
            } else {
                return (r + c) * (r + c) + 1;
            }
        } else if (r < c) {
            if (Math.abs(r) >= Math.abs(c)) {
                return (r + r) * (r + r) + 1 + (r - c);
            } else {
                return (c + c - 1) * (c + c - 1) + (c - r);
            }
        } else {
            if (Math.abs(r) <= Math.abs(c)) {
                return (c + c) * (c + c) + 1 - (c - r);
            } else {
                return (r + r + 1) * (r + r + 1) - (r - c);
            }
        }
    }
}
