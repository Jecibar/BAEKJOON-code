package swexpertacademy.level4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution1226 {
    private static final int SIZE = 16;

    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int[][] maze = new int[SIZE][SIZE];
        Queue<Point> queue;
        Point currentPoint, movePoint;
        String inputString;
        int inputNumber;
        boolean flag;

        for (int i = 1; i <= 10; i++) {
            queue = new LinkedList<Point>();
            flag = false;
            scanner.nextInt();

            for (int j = 0; j < SIZE; j++) {
                inputString = scanner.next();
                for (int k = 0; k < SIZE; k++) {
                    inputNumber = Integer.parseInt(String.valueOf(inputString.charAt(k)));
                    if (inputNumber == 2) {
                        queue.add(new Point(k, j));
                    }

                    maze[j][k] = inputNumber;
                }
            }

            while (!queue.isEmpty()) {
                currentPoint = queue.poll();
                if (maze[currentPoint.y][currentPoint.x] == 3) {
                    flag = true;
                    break;
                }

                if (currentPoint.left && currentPoint.x > 0 && maze[currentPoint.y][currentPoint.x - 1] != 1) {
                    movePoint = new Point(currentPoint.x - 1, currentPoint.y);
                    movePoint.right = false;
                    queue.add(movePoint);
                }

                if (currentPoint.right && currentPoint.x < SIZE - 1 && maze[currentPoint.y][currentPoint.x + 1] != 1) {
                    movePoint = new Point(currentPoint.x + 1, currentPoint.y);
                    movePoint.left = false;
                    queue.add(movePoint);
                }

                if (currentPoint.top && currentPoint.y > 0 && maze[currentPoint.y - 1][currentPoint.x] != 1) {
                    movePoint = new Point(currentPoint.x, currentPoint.y - 1);
                    movePoint.bottom = false;
                    queue.add(movePoint);
                }

                if (currentPoint.bottom && currentPoint.y < SIZE - 1 && maze[currentPoint.y + 1][currentPoint.x] != 1) {
                    movePoint = new Point(currentPoint.x, currentPoint.y + 1);
                    movePoint.top = false;
                    queue.add(movePoint);
                }
            }

            System.out.println("#" + i + " " + (flag ? 1 : 0));
        }
    }

    private static class Point {
        int x, y;
        boolean left, right, top,  bottom;

        Point() {
            left = right = top = bottom = true;
        }

        Point(int x, int y) {
            this();
            this.x = x;
            this.y = y;
        }
    }
}