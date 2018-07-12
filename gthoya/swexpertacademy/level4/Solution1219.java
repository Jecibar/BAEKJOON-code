package swexpertacademy.level4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution1219 {
    private static final int SIZE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orderCount, input1, input2;
        int[] data1, data2;
        Queue queue;

        for (int i = 1; i <= 10; i++) {
            scanner.nextInt();
            orderCount = scanner.nextInt();

            data1 = new int[SIZE];
            data2 = new int[SIZE];
            queue = new LinkedList<Integer>();
            queue.offer(0);

            for (int j = 0; j < orderCount; j++) {
                input1 = scanner.nextInt();
                input2 = scanner.nextInt();

                if (data1[input1] == 0) {
                    data1[input1] = input2;
                } else {
                    data2[input1] = input2;
                }
            }

            System.out.println("#" + i + " " + getResult(data1, data2, queue));
        }
    }

    private static int getResult(int[] data1, int[] data2, Queue queue) {
        int result = 0;
        int currentPoint;
        boolean[] isVisited = new boolean[SIZE];

        while (queue.size() > 0) {
            currentPoint = (int) queue.poll();
            if (currentPoint == 99) {
                result = 1;
                break;
            }

            if (data1[currentPoint] != 0 && isVisited[data1[currentPoint]] == false) {
                queue.offer(data1[currentPoint]);
                isVisited[data1[currentPoint]] = true;
            }

            if (data2[currentPoint] != 0 && isVisited[data2[currentPoint]] == false) {
                queue.offer(data2[currentPoint]);
                isVisited[data2[currentPoint]] = true;
            }
        }

        return result;
    }
}
