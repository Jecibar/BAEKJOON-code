package swexpertacademy.level4;

import java.util.Scanner;

public class Solution1211 {
    private static final int WIDTH = 100;
    private static final int HEIGHT = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] ladder = new int[HEIGHT][WIDTH];
        int location, minMoveCount, currentMoveCount, minIndex = 0;
        boolean isGoingRight, isGoingLeft;

        for (int i = 1; i <= 10; i++) {
            minMoveCount = WIDTH * HEIGHT;
            scanner.nextInt();

            for (int j = 0; j < HEIGHT; j++) {
                for (int k = 0; k < WIDTH; k++) {
                    ladder[j][k] = scanner.nextInt();
                }
            }

            for (int j = 0; j < WIDTH; j++) {
                if (ladder[0][j] == 0) {
                    continue;
                }

                location = j;
                currentMoveCount = 0;
                isGoingRight = isGoingLeft = false;
                for (int k = 1; k < HEIGHT; ) {
                    if (!isGoingRight && location != 0 && ladder[k][location - 1] == 1) {
                        location--;
                        isGoingLeft = true;
                    } else if (!isGoingLeft && location != WIDTH - 1 && ladder[k][location + 1] == 1) {
                        location++;
                        isGoingRight = true;
                    } else {
                        k++;
                        isGoingRight = isGoingLeft = false;
                    }

                    currentMoveCount++;
                }

                if (minMoveCount > currentMoveCount) {
                    minMoveCount = currentMoveCount;
                    minIndex = j;
                }
            }

            System.out.println("#" + i + " " + minIndex);
        }
    }
}
