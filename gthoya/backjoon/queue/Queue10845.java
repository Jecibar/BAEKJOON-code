package backjoon.queue;

import java.util.*;

public class Queue10845 {
    public static void main(String[] ar) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int orderCount = scanner.nextInt();
        Queue<Integer> queue = new Queue<Integer>(orderCount);
        String inputString;

        for (int i = 0; i < orderCount; i++) {
            inputString = scanner.next();
            switch (inputString) {
                case "push" :
                    queue.enqueue(scanner.nextInt());
                    break;

                case "pop" :
                    if (queue.isEmpty()) {
                        System.out.println("-1");
                        continue;
                    }

                    System.out.println(queue.dequeue());
                    break;

                case "size" :
                    System.out.println(queue.size());
                    break;

                case "empty" :
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;

                case "front" :
                    System.out.println(queue.isEmpty() ? -1 : queue.front());
                    break;

                case "back" :
                    System.out.println(queue.isEmpty() ? -1 : queue.back());
                    break;
            }
        }
    }

    static class Queue<E> {
        private Object[] queue;

        private int enQueueIndex;
        private int deQueueIndex;

        public Queue(int capacity) throws Exception {
            this.queue = new Object[capacity];
        }

        public void enqueue(E values) {
            queue[enQueueIndex++] = values;
        }

        public E dequeue() {
            E result = (E) queue[deQueueIndex];
            queue[deQueueIndex++] = null;

            return result;
        }

        public int size() {
            return enQueueIndex - deQueueIndex;
        }

        public boolean isEmpty() {
            if (deQueueIndex == enQueueIndex) {
                return true;
            }

            return false;
        }

        public E front() {
            return (E) queue[deQueueIndex];
        }

        public E back() {
            return (E) queue[enQueueIndex - 1];
        }
    }
}
