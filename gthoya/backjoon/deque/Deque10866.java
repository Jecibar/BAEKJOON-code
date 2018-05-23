package backjoon.deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Deque10866 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int orderCount = scanner.nextInt();
        Deque<Integer> deque = new LinkedList<Integer>();

        for (int i = 0; i < orderCount; i++) {
            switch (scanner.next()) {
                case "push_front" :
                    deque.addFirst(scanner.nextInt());
                    break;
                case "push_back" :
                    deque.addLast(scanner.nextInt());
                    break;
                case "pop_front" :
                    if (deque.size() == 0) {
                        System.out.println(-1);
                        continue;
                    }

                    System.out.println(deque.pollFirst());
                    break;
                case "pop_back" :
                    if (deque.size() == 0) {
                        System.out.println(-1);
                        continue;
                    }

                    System.out.println(deque.pollLast());
                    break;
                case "size" :
                    System.out.println(deque.size());
                    break;
                case "empty" :
                    System.out.println(deque.size() == 0 ? 1 : 0);
                    break;
                case "front" :
                    if (deque.size() == 0) {
                        System.out.println(-1);
                        continue;
                    }

                    System.out.println(deque.peekFirst());
                    break;
                case "back" :
                    if (deque.size() == 0) {
                        System.out.println(-1);
                        continue;
                    }

                    System.out.println(deque.peekLast());
                    break;
                default :
                    break;
            }
        }
    }
}
