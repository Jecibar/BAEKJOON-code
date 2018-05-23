package backjoon.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue01186 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < n; i++) {
            queue.offer(i + 1);
        }

        System.out.print("<");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k - 1; j++) {
                queue.offer(queue.poll());
            }

            System.out.print(queue.poll());
            if ((i - 1) != n) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
