package swexpertacademy.level3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1208 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int[] boxes;
        int flattenCount;

        for (int i = 1; i <= 10; i++) {
            flattenCount = scanner.nextInt();
            boxes = new int[100];

            for (int j = 0; j < 100; j++) {
                boxes[j] = scanner.nextInt();
            }

            Arrays.sort(boxes);
            for (int j = 0; j < flattenCount; j++) {
                boxes[0]++;
                boxes[99]--;

                if (boxes[0] > boxes[1] || boxes[98] > boxes[99]) {
                    Arrays.sort(boxes);
                }
            }

            System.out.println("#" + i + " " + (boxes[99] - boxes[0]));
        }
    }
}
