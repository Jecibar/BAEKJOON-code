package swexpertacademy.level4;

import java.util.Scanner;

public class Solution1231 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        Node[] tree;
        int orderCount;
        String inputString;

        for (int i = 1; i <= 10; i++) {
            orderCount = scanner.nextInt();
            tree = new Node[orderCount + 1];

            for (int j = 0; j <= orderCount; j++) {
                inputString = scanner.nextLine();

                String[] splitArray = inputString.split(" ");
                tree[j] = new Node();

                for (int k = 1; k < splitArray.length; k++) {
                    if (k == 1) {
                        tree[j].setData(splitArray[k]);
                    } else if (k == 2) {
                        tree[j].setLeft(Integer.parseInt(splitArray[k]));
                    } else if (k == 3) {
                        tree[j].setRight(Integer.parseInt(splitArray[k]));
                    }
                }
            }

            System.out.print("#" + i + " ");
            printAll(tree, 1);
            System.out.println();
        }
    }

    private static void printAll(Node[] tree, int number) {
        if (tree == null) {
            return;
        }

        if (tree[number].getLeft() > 0) {
            printAll(tree, tree[number].getLeft());
        }

        System.out.print(tree[number].getData());

        if (tree[number].getRight() > 0) {
            printAll(tree, tree[number].getRight());
        }
    }

    static class Node {
        private String data;

        private int left;
        private int right;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public int getLeft() {
            return left;
        }

        public void setLeft(int left) {
            this.left = left;
        }

        public int getRight() {
            return right;
        }

        public void setRight(int right) {
            this.right = right;
        }
    }
}
