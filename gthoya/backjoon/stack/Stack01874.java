package backjoon.stack;

import java.util.*;

public class Stack01874 {
    public static void main (String[] ar) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();;
        Queue<String> queue = new LinkedList<String>();

        int orderCount = scanner.nextInt();
        int inputNumber, topNumber = 0, currentNumber = 0;
        boolean isSuccess = true;

        for (int i = 0; i < orderCount; i++) {
            try {
                inputNumber = scanner.nextInt();

                if (inputNumber > topNumber) {
                    while (inputNumber != topNumber) {
                        stack.push(++topNumber);
                        queue.add("+");
                    }

                    currentNumber = stack.pop() - 1;
                    queue.add("-");
                } else {
                    if (stack.empty()) {
                        isSuccess = false;
                        break;
                    }

                    while (inputNumber <= currentNumber) {
                        currentNumber = stack.pop() - 1;
                        queue.add("-");
                    }
                }
            } catch (Exception e) {
                isSuccess = false;
                break;
            }
        }

        if (isSuccess) {
            while (!queue.isEmpty()) {
                System.out.println(queue.poll());
            }
        } else {
            System.out.println("NO");
        }
    }
}
