package backjoon.tree;

import java.util.Scanner;

public class TreePrinter {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Node[] tree = new Node[count];
        char data, left, right;

        for (int i = 0; i < count; i++) {
            data = scanner.next().charAt(0);
            left = scanner.next().charAt(0);
            right = scanner.next().charAt(0);

            tree[data - 'A'] = new Node(data, left, right);
        }

        preOrder(tree, 'A');
        System.out.println();

        inOrder(tree, 'A');
        System.out.println();

        postOrder(tree, 'A');
    }

    private static void preOrder(Node[] tree, char data) {
        System.out.print(tree[data - 'A'].getData());

        if (tree[data - 'A'].getLeft() != '.') {
            preOrder(tree, tree[data - 'A'].getLeft());
        }

        if (tree[data - 'A'].getRight() != '.') {
            preOrder(tree, tree[data - 'A'].getRight());
        }
    }

    private static void inOrder(Node[] tree, char data) {
        if (tree[data - 'A'].getLeft() != '.') {
            inOrder(tree, tree[data - 'A'].getLeft());
        }

        System.out.print(tree[data - 'A'].getData());

        if (tree[data - 'A'].getRight() != '.') {
            inOrder(tree, tree[data - 'A'].getRight());
        }
    }

    private static void postOrder(Node[] tree, char data) {
        if (tree[data - 'A'].getLeft() != '.') {
            postOrder(tree, tree[data - 'A'].getLeft());
        }

        if (tree[data - 'A'].getRight() != '.') {
            postOrder(tree, tree[data - 'A'].getRight());
        }

        System.out.print(tree[data - 'A'].getData());
    }
}

class Node {
    private char data;
    private char left;
    private char right;

    public Node(char data, char left, char right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public char getLeft() {
        return left;
    }

    public void setLeft(char left) {
        this.left = left;
    }

    public char getRight() {
        return right;
    }

    public void setRight(char right) {
        this.right = right;
    }
}
