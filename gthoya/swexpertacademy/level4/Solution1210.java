package swexpertacademy.level4;

import java.util.Scanner;

public class Solution1210 {
    private static final int WIDTH = 100;
    private static final int HEIGHT = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] ladder = new int[HEIGHT][WIDTH];
        int location = 0;
        boolean isGoingRight, isGoingLeft;

        for (int i = 1; i <= 10; i++) {
            scanner.nextInt();

            for (int j = 0; j < HEIGHT; j++) {
                for (int k = 0; k < WIDTH; k++) {
                    ladder[j][k] = scanner.nextInt();
                }
            }

            for (int j = 0; j < WIDTH; j++) {
                if (ladder[HEIGHT - 1][j] == 2) {
                    location = j;
                    break;
                }
            }

            isGoingRight = isGoingLeft = false;
            for (int j = HEIGHT - 2; j > 0;) {
                if (!isGoingRight && location != 0 && ladder[j][location - 1] == 1) {
                    location--;
                    isGoingLeft = true;
                } else if (!isGoingLeft && location != WIDTH - 1 && ladder[j][location + 1] == 1) {
                    location++;
                    isGoingRight = true;
                } else {
                    j--;
                    isGoingRight = isGoingLeft = false;
                }
            }

            System.out.println("#" + i + " " + location);
        }
    }
}
