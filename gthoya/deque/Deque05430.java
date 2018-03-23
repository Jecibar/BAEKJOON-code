package deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Deque05430 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int orderCount = scanner.nextInt();
        String order, input;
        int queueSize;
        String[] tempStringToArray;
        Deque<String> queue;
        boolean isError, isDescending;

        for (int i = 0; i < orderCount; i++) {
            queue = new LinkedList<String>();
            isError = isDescending = false;
            order = scanner.next();
            queueSize = scanner.nextInt();
            input = scanner.next();
            input = input.substring(1, input.length() - 1);
            tempStringToArray = input.split(",");

            for (int j = 0; j < queueSize; j++) {
                queue.offer(tempStringToArray[j]);
            }

            int orderLength = order.length();
            for (int j = 0; j < orderLength; j++) {
                if (order.charAt(j) == 'R') {
                    isDescending = !isDescending;
                } else if (order.charAt(j) == 'D') {
                    if (queueSize == 0) {
                        isError = true;
                        break;
                    }

                    if (isDescending) {
                        queue.pollLast();
                    } else {
                        queue.pollFirst();
                    }

                    queueSize--;
                }
            }

            if (isError) {
                System.out.println("error");
                continue;
            }

            System.out.print("[");
            for (int j = 0; j < queueSize; j++) {
                if (isDescending) {
                    System.out.print(queue.pollLast());
                } else {
                    System.out.print(queue.pollFirst());
                }

                if (j != (queueSize - 1)) {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
    }
}
