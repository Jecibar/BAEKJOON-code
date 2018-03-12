package stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack09012 {
    public static void main (String[] ar) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack;

        int orderCount = scanner.nextInt();
        String inputString;
        Character currentChar;
        int size;
        boolean flag;

        for (int i = 0; i < orderCount; i++) {
            inputString = scanner.next();
            size = inputString.length();
            flag = true;
            stack = new Stack<Character>();

            for (int j = 0; j < size; j++) {
                currentChar = inputString.charAt(j);

                if (currentChar == ')') {
                    if (stack.empty()) {
                        flag = false;
                        break;
                    }

                    stack.pop();
                } else {
                    stack.push(currentChar);
                }
            }

            System.out.println(flag && stack.isEmpty() ? "YES" : "NO");
        }
    }
}
