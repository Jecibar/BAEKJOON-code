package queue;

import java.util.*;

public class Queue01966 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int orderCount = scanner.nextInt();
        int docCount, printNumber, printCount;
        boolean isPrintData;
        List<PrintNode> queue;
        PrintNode currentData;

        for (int i = 0; i < orderCount; i++) {
            docCount = scanner.nextInt();
            printNumber = scanner.nextInt();
            printCount = 0;

            queue = new ArrayList<PrintNode>();

            for (int j = 0; j < docCount; j++) {
                PrintNode node = new PrintNode(j, scanner.nextInt());
                queue.add(node);
            }

            while (!queue.isEmpty()) {
                currentData = queue.remove(0);
                isPrintData = true;

                for (int k = 0; k < docCount - printCount - 1; k++) {
                    if (currentData.getData() < queue.get(k).getData()) {
                        isPrintData = false;
                        break;
                    }
                }

                if (isPrintData) {
                    printCount++;

                    if (currentData.getNo() == printNumber) {
                        System.out.println(printCount);
                        break;
                    }
                } else {
                    queue.add(currentData);
                }
            }
        }
    }
}

class PrintNode {
    private int no;
    private int data;

    public PrintNode(int no, int data) {
        this.no = no;
        this.data = data;
    }

    public int getNo() {
        return no;
    }

    public int getData() {
        return data;
    }
}
