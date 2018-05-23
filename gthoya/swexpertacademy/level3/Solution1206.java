package swexpertacademy.level3;

import java.util.Scanner;

public class Solution1206 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int buildingCount, totalViewRight, maxHeight;
        int[] building;

        for (int i = 1; i <= 10; i++) {
            buildingCount = scanner.nextInt();
            totalViewRight = 0;
            building = new int[buildingCount];

            for (int j = 0; j < buildingCount; j++) {
                building[j] = scanner.nextInt();
            }

            buildingCount -= 2;
            for (int j = 2; j < buildingCount; j++) {
                maxHeight = 0;
                for (int k = 0; k < 5; k++) {
                    if (k == 2) {
                        continue;
                    }

                    maxHeight = (maxHeight > building[j + k - 2] ? maxHeight : building[j + k - 2]);
                }

                totalViewRight += (building[j] > maxHeight ? building[j] - maxHeight : 0);
            }

            System.out.println("#" + i + " " + totalViewRight);
        }
    }
}
