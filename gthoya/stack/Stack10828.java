package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stack10828 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> stack = new ArrayList<Integer>();
        int orderCount = scanner.nextInt();

        for (int i = 0; i < orderCount; i++) {
            switch (scanner.next()) {
                case "push" :
                    stack.add(scanner.nextInt());
                    break;

                case "pop" :
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                        continue;
                    }

                    System.out.println(stack.get(stack.size() - 1));
                    stack.remove(stack.size() - 1);
                    break;

                case "top" :
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                        continue;
                    }

                    System.out.println(stack.get(stack.size() - 1));
                    break;

                case "size" :
                    System.out.println(stack.size());
                    break;

                case "empty" :
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
            }
        }
    }
}