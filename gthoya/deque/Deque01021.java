package deque;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Deque01021 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int dequeSize = scanner.nextInt();
        int pullCount = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<Integer>();
        List<Integer> list = new LinkedList<Integer>();
        int frontCount, backCount, resultCount = 0;
        int beforeIndex, nextIndex = 0;

        for (int i = 0; i < pullCount; i++) {
            queue.add(scanner.nextInt());
        }

        for (int i = 1; i <= dequeSize; i++) {
            list.add(i);
        }

        for (int i = 0; i < pullCount; i++) {
            int nextExtractNumber = queue.poll();
            beforeIndex = nextIndex;
            frontCount = backCount = 0;

            for (int j = 0; j < dequeSize; j++) {
                if (list.get(j) == nextExtractNumber) {
                    nextIndex = j;
                    break;
                }
            }

            if (nextIndex - beforeIndex > 0) {
                frontCount = nextIndex - beforeIndex;
                backCount = dequeSize - nextIndex + beforeIndex;
            } else if (nextIndex - beforeIndex < 0) {
                frontCount = dequeSize - beforeIndex + nextIndex;
                backCount = beforeIndex - nextIndex;
            }

            resultCount += (frontCount < backCount) ? frontCount : backCount;
            list.remove(nextIndex);
            dequeSize--;
        }

        System.out.println(resultCount);
    }
}
