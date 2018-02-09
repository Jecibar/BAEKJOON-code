import java.util.Scanner;

public class SpaceShuttle {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int orderCount = scanner.nextInt();

        long x, y, distance;
        long square, plusOneSquare;

        for (int i = 0; i < orderCount; i++) {
            x = scanner.nextLong();
            y = scanner.nextLong();

            distance = y - x;

            for (long j = 0; j < distance; j++) {
                square = (long) Math.pow(j, 2);
                plusOneSquare = (long) Math.pow(j + 1, 2);

                if (square < distance && plusOneSquare >= distance) {
                    if (plusOneSquare - j > distance) {
                        System.out.println(2 * (j + 1) - 2);
                    } else {
                        System.out.println(2 * (j + 1) - 1);
                    }

                    break;
                }
            }
        }
    }
}