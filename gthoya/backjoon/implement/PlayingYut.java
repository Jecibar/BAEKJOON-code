package backjoon.implement;

import java.util.Scanner;

public class PlayingYut {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int count0;
        char[] result = {'E', 'A', 'B', 'C', 'D'};

        for (int i = 0; i < 3; i++) {
            count0 = 0;

            for (int j = 0; j < 4; j++) {
                if (scanner.nextInt() == 0) {
                    count0++;
                }
            }

            System.out.println(result[count0]);
        }
    }
}
